/*
 * Copyright 2009-2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.cloudfoundry.client.lib;

import java.util.Date;
import java.util.Map;

public class InstanceInfo {
	private final Date since;
	private final int index;
	private final String state; // TODO make enum, need to know the valid values

	public InstanceInfo(Map<String, Object> infoMap) {
		since = new Date(CloudUtil.parse(Long.class, infoMap.get("since")) * 1000);
		index = CloudUtil.parse(Integer.class, infoMap.get("index"));
		state = CloudUtil.parse(String.class, infoMap.get("state"));
	}

	public Date getSince() {
		return since;
	}

	public int getIndex() {
		return index;
	}

	public String getState() {
		return state;
	}
}