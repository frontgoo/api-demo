/**
 * This document and its contents are protected by copyright 2017 and owned by gxb.io Inc. The
 * copying and reproduction of this document and/or its content (whether wholly or partly) or any
 * incorporation of the same into any other material in any media or format of any kind is strictly
 * prohibited. All rights are reserved.
 *
 * Copyright (c) gxb.io Inc. 2017
 */
package com.gxb.sdk.view;

import java.awt.Frame;

import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.gxb.sdk.parm.config.LoginField;

/**
 *
 * @author <A HREF="mailto:wangcheng@gxb.io">Cheng Wang</A>
 * @version 1.0
 * @since 2017年7月2日 下午11:25:34
 */
public class JPaneView {
    private JPanel panel;
    private String title;
    private Icon icon;
    private Frame viewFrame;

    public JPaneView(JPanel panel, String title, Icon icon, Frame viewFrame) {
        this.panel = panel;
        this.title = title;
        this.icon = icon;
        this.viewFrame = viewFrame;
    }

    public JPanel getPanel() {
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public Frame getViewFrame() {
        return viewFrame;
    }

    public void setViewFrame(Frame viewFrame) {
        this.viewFrame = viewFrame;
    }

    public JPanel addFiled( JLabel lbl, JTextField txt) {
        panel.add(lbl);
        panel.add(txt);
        return panel;
    }

}
