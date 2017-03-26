package com.thinkbiganalytics.feedmgr.rest.model;

/*-
 * #%L
 * thinkbig-feed-manager-rest-model
 * %%
 * Copyright (C) 2017 ThinkBig Analytics
 * %%
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
 * #L%
 */

import java.util.Collections;
import java.util.List;

/**
 */
public class ImportTemplateOptions extends ImportOptions{

    @Deprecated
    public enum IMPORT_CONNECTING_FLOW {
        YES, NO, NOT_SET
    }

    private boolean createReusableFlow;


    public boolean isCreateReusableFlow() {
        return createReusableFlow;
    }

    public void setCreateReusableFlow(boolean createReusableFlow) {
        this.createReusableFlow = createReusableFlow;
    }


}
