/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.rocketmq.common.message;

import java.util.HashSet;

public class MessageConst {
	 /**
     * 消息关键词，多个Key用KEY_SEPARATOR隔开（查询消息使用）
     */
    public static final String PROPERTY_KEYS = "KEYS";
    /**
     * 消息标签，只支持设置一个Tag（服务端消息过滤使用）
     */
    public static final String PROPERTY_TAGS = "TAGS";
    /**
     * 是否等待服务器将消息存储完毕再返回（可能是等待刷盘完成或者等待同步复制到其他服务器）
     */
    public static final String PROPERTY_WAIT_STORE_MSG_OK = "WAIT";
    /**
     * 消息延时投递时间级别，0表示不延时，大于0表示特定延时级别（具体级别在服务器端定义）
     */
    public static final String PROPERTY_DELAY_TIME_LEVEL = "DELAY";
    
    
    /**
     * 内部使用
     */
    public static final String PROPERTY_RETRY_TOPIC = "RETRY_TOPIC";
    public static final String PROPERTY_REAL_TOPIC = "REAL_TOPIC";
    public static final String PROPERTY_REAL_QUEUE_ID = "REAL_QID";
    public static final String PROPERTY_TRANSACTION_PREPARED = "TRAN_MSG";
    public static final String PROPERTY_PRODUCER_GROUP = "PGROUP";
    public static final String PROPERTY_MIN_OFFSET = "MIN_OFFSET";
    public static final String PROPERTY_MAX_OFFSET = "MAX_OFFSET";
    public static final String PROPERTY_BUYER_ID = "BUYER_ID";
    public static final String PROPERTY_ORIGIN_MESSAGE_ID = "ORIGIN_MESSAGE_ID";
    public static final String PROPERTY_TRANSFER_FLAG = "TRANSFER_FLAG";
    public static final String PROPERTY_CORRECTION_FLAG = "CORRECTION_FLAG";
    public static final String PROPERTY_MQ2_FLAG = "MQ2_FLAG";
    public static final String PROPERTY_RECONSUME_TIME = "RECONSUME_TIME";
    public static final String PROPERTY_MSG_REGION = "MSG_REGION";
    public static final String PROPERTY_TRACE_SWITCH = "TRACE_ON";
    public static final String PROPERTY_UNIQ_CLIENT_MESSAGE_ID_KEYIDX = "UNIQ_KEY";
    public static final String PROPERTY_MAX_RECONSUME_TIMES = "MAX_RECONSUME_TIMES";
    public static final String PROPERTY_CONSUME_START_TIMESTAMP = "CONSUME_START_TIME";

    public static final String KEY_SEPARATOR = " ";

    public static final HashSet<String> STRING_HASH_SET = new HashSet<String>();

    static {
        STRING_HASH_SET.add(PROPERTY_TRACE_SWITCH);
        STRING_HASH_SET.add(PROPERTY_MSG_REGION);
        STRING_HASH_SET.add(PROPERTY_KEYS);
        STRING_HASH_SET.add(PROPERTY_TAGS);
        STRING_HASH_SET.add(PROPERTY_WAIT_STORE_MSG_OK);
        STRING_HASH_SET.add(PROPERTY_DELAY_TIME_LEVEL);
        STRING_HASH_SET.add(PROPERTY_RETRY_TOPIC);
        STRING_HASH_SET.add(PROPERTY_REAL_TOPIC);
        STRING_HASH_SET.add(PROPERTY_REAL_QUEUE_ID);
        STRING_HASH_SET.add(PROPERTY_TRANSACTION_PREPARED);
        STRING_HASH_SET.add(PROPERTY_PRODUCER_GROUP);
        STRING_HASH_SET.add(PROPERTY_MIN_OFFSET);
        STRING_HASH_SET.add(PROPERTY_MAX_OFFSET);
        STRING_HASH_SET.add(PROPERTY_BUYER_ID);
        STRING_HASH_SET.add(PROPERTY_ORIGIN_MESSAGE_ID);
        STRING_HASH_SET.add(PROPERTY_TRANSFER_FLAG);
        STRING_HASH_SET.add(PROPERTY_CORRECTION_FLAG);
        STRING_HASH_SET.add(PROPERTY_MQ2_FLAG);
        STRING_HASH_SET.add(PROPERTY_RECONSUME_TIME);
        STRING_HASH_SET.add(PROPERTY_UNIQ_CLIENT_MESSAGE_ID_KEYIDX);
        STRING_HASH_SET.add(PROPERTY_MAX_RECONSUME_TIMES);
        STRING_HASH_SET.add(PROPERTY_CONSUME_START_TIMESTAMP);
    }
}
