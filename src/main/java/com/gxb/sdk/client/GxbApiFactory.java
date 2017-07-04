package com.gxb.sdk.client;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gxb.sdk.exception.GxbApiException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import retrofit2.Retrofit;

/**
 *
 * @author <A HREF="mailto:wangcheng@gxb.io">Cheng Wang</A>
 * @version 1.0
 * @since 2017年6月23日 下午2:18:30
 */
public class GxbApiFactory {
    private static final Logger logger = LoggerFactory.getLogger(GxbApiFactory.class);

    private Retrofit retrofit;

    private GxbApiFactory(final String baseUrl, final Long timeout) {
        OkHttpClient httpClient = new OkHttpClient().newBuilder().readTimeout(timeout, TimeUnit.MILLISECONDS).addInterceptor(new Interceptor() {

            /*
             * 记录访问日志，统一接口异常处理
             * 
             * @see okhttp3.Interceptor#intercept(okhttp3.Interceptor.Chain)
             */
            @Override
            public Response intercept(Chain chain) throws IOException {
                logger.info("gxb api request:" + chain.request().toString());
                Response response = chain.proceed(chain.request());
                logger.info("gxb response:" + response.toString());
                if (!response.isSuccessful()) {
                    throw new GxbApiException(response.body().string());
                } else {
                    return response;
                }
            }

        }).writeTimeout(timeout, TimeUnit.MILLISECONDS).build();

        retrofit = new Retrofit.Builder().baseUrl(baseUrl).addConverterFactory(GxbGsonConverterFactory.create()).callFactory(httpClient).build();
    }


    public <T> T newApi(Class<T> clz) {
        if (clz.isInterface()) return retrofit.create(clz);
        throw new IllegalArgumentException("interface class required");
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String baseUrl = "https://prod.gxb.io/crawler/auth/";
        private Long timeout = 15000L; // default 15s;

        public Builder baseUrl(String url) {
            this.baseUrl = url;
            return this;
        }

        public Builder timeout(Long ms) {
            this.timeout = ms;
            return this;
        }

        public GxbApiFactory build() {
            if (baseUrl == null || baseUrl.isEmpty()) {
                throw new IllegalArgumentException("baseUrl invalid");
            }
            return new GxbApiFactory(this.baseUrl, timeout);
        }
    }
}
