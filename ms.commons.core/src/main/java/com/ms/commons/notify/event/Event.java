/*
 * Copyright 2011-2016 ZXC.com All right reserved. This software is the confidential and proprietary information of
 * ZXC.com ("Confidential Information"). You shall not disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into with ZXC.com.
 */
package com.ms.commons.notify.event;

import java.io.Serializable;
import java.util.Date;

/**
 * @author zxc Apr 12, 2013 2:56:41 PM
 */
public interface Event extends Serializable {

    /**
     * 事件类型
     */
    EventType getEventType();

    /**
     * 事件参数
     */
    <T extends Object> T getData();

    /**
     * 事件的简要描述
     */
    String summary();

    /**
     * 时间发生的时间
     */
    Date time();
}
