/*
 * Copyright 2020-present Open Networking Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.onosproject.kubevirtnode.api;

import org.onosproject.event.ListenerService;

/**
 * Service for interfacing with the inventory of KubeVirt API server config.
 */
public interface KubevirtApiConfigService
        extends ListenerService<KubevirtApiConfigEvent, KubevirtApiConfigListener> {
    String APP_ID = "org.onosproject.kubevirtnode";

    /**
     * Returns the registered API config.
     *
     * @return API config
     */
    KubevirtApiConfig apiConfig();
}
