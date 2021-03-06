/*
 * Copyright 2016 Lime - HighTech Solutions s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.getlime.push.model.request;

/**
 * Request object used for device registration.
 *
 * @author Petr Dvorak, petr@lime-company.eu
 */
public class CreateDeviceRequest {

    private Long appId;
    private String token;
    private String platform;
    private String activationId;

    /**
     * Get app ID associated with given device registration.
     * @return App ID.
     */
    public Long getAppId() {
        return appId;
    }

    /**
     * Set app ID associated with given device registration.
     * @param appId App ID.
     */
    public void setAppId(Long appId) {
        this.appId = appId;
    }

    /**
     * Get APNs / FCM push token.
     * @return Push token value.
     */
    public String getToken() {
        return token;
    }

    /**
     * Set APNs / FCM push token.
     * @param token Push token value.
     */
    public void setToken(String token) {
        this.token = token;
    }

    /**
     * Get the platform name, either "ios" or "android".
     * @return Platform name, "ios" or "android".
     */
    public String getPlatform() {
        return platform;
    }

    /**
     * Set the platform name.
     * @param platform Platform name.
     */
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * Get PowerAuth 2.0 activation ID associated with given device registration.
     * @return Activation ID.
     */
    public String getActivationId() {
        return activationId;
    }

    /**
     * Set PowerAuth 2.0 activation ID associated with given device registration.
     * @param activationId Activation ID.
     */
    public void setActivationId(String activationId) {
        this.activationId = activationId;
    }

}
