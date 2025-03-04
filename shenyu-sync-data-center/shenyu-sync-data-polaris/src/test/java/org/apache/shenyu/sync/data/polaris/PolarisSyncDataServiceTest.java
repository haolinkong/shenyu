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

package org.apache.shenyu.sync.data.polaris;

import com.tencent.polaris.configuration.api.core.ConfigFileService;
import org.apache.shenyu.sync.data.polaris.config.PolarisConfig;
import org.apache.shenyu.sync.data.polaris.handler.PolarisMockConfigService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.HashMap;

/**
 * add test case for {@link PolarisSyncDataService}.
 */
public class PolarisSyncDataServiceTest {

    private PolarisSyncDataService polarisSyncDataService;

    @BeforeEach
    public void setup() {
        PolarisConfig polarisConfig = new PolarisConfig();
        ConfigFileService configFileService = new PolarisMockConfigService(new HashMap<>());
        polarisSyncDataService = new PolarisSyncDataService(polarisConfig, configFileService, null,
                Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
    }

    @Test
    public void testStart() {
        polarisSyncDataService.start();
    }

    @Test
    public void testClose() {
        polarisSyncDataService.close();
    }
}
