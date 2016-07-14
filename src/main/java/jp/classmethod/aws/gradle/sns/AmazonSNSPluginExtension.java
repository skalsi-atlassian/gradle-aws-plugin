/*
 * Copyright 2013-2016 Classmethod, Inc.
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
package jp.classmethod.aws.gradle.sns;

import com.amazonaws.services.sns.AmazonSNSClient;
import jp.classmethod.aws.gradle.common.BaseRegionAwarePluginExtension;
import org.gradle.api.Project;

public class AmazonSNSPluginExtension extends BaseRegionAwarePluginExtension<AmazonSNSClient> {

    public static final String NAME = "sns";

    public AmazonSNSPluginExtension(Project project) {
        super(project, AmazonSNSClient.class);
    }

}
