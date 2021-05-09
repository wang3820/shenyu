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

package org.apache.shenyu.plugin.sign.subscriber;

import org.apache.shenyu.plugin.sign.cache.SignAuthDataCache;
import org.apache.shenyu.sync.data.api.AuthDataSubscriber;
import org.apache.shenyu.common.dto.AppAuthData;

/**
 * The type Sign auth data subscriber.
 */
public class SignAuthDataSubscriber implements AuthDataSubscriber {
    
    @Override
    public void onSubscribe(final AppAuthData appAuthData) {
        SignAuthDataCache.getInstance().cacheAuthData(appAuthData);
    }
    
    @Override
    public void unSubscribe(final AppAuthData appAuthData) {
        SignAuthDataCache.getInstance().removeAuthData(appAuthData);
    }
}
