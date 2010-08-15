/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with this
 * work for additional information regarding copyright ownership. The ASF
 * licenses this file to You under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.apache.sling.commons.auth.spi;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Service interface which allows bundles to modify the AuthenticationInfo object
 * after authentication has been performed.
 *
 */
public interface AuthenticationInfoPostProcessor {

    /**
     * The name under which an implementation of this interface must be
     * registered to be used as an authentication info post processor.
     */
    static final String SERVICE_NAME = "org.apache.sling.commons.auth.spi.AuthenticationInfoPostProcessor";

    /**
     * Perform some post-processing on the AuthenticationInfo object.
     *
     * @param info
     * @param request
     * @param response
     */
    void postProcess(AuthenticationInfo info, HttpServletRequest request, HttpServletResponse response);

}
