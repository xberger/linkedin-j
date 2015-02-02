/*
 * Copyright 2010-2011 Nabeel Mukhtar 
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * 
 *  http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 * 
 */
package com.google.code.linkedinapi.client.enumeration;

import java.util.HashMap;
import java.util.Map;

/**
 * Company Update Types
 * 
 * see: <a href="https://developer.linkedin.com/reading-company-shares">https://developer.linkedin.com/reading-company-shares</a>
 * 
 * (type "new-product" has been deprecated by LinkedIn) 
 * 
 * @author xberger
 *
 */
public enum CompanyUpdateType implements FieldEnum {

    /**
     * New job postings on LinkedIn by the specified company.
     */
    JOB_POSTING("job-posting"),

    /**
     * An update on the company's status or content shared by the company.
     */
    STATUS_UPDATE ("status-update");
    
    /**
     * Field Description.
     */
	private static final Map<String, CompanyUpdateType> stringToEnum = new HashMap<String, CompanyUpdateType>();

	static { // Initialize map from constant name to enum constant
		for (CompanyUpdateType op : values()) {
			stringToEnum.put(op.fieldName(), op);
		}
	}
    
    /** Field description */
    private final String fieldName;

    /**
     * Constructs ...
     *
     *
     * @param name
     */
    CompanyUpdateType(String name) {
        this.fieldName = name;
    }

    /**
     * @return the name of the field
     */
    public String fieldName() {
        return this.fieldName;
    }

    /**
     * Method description
     *
     *
     * @return
     */
    @Override
    public String toString() {
        return fieldName();
    }

	/**
	 *
	 * @return Returns CompanyUpdateType for string, or null if string is invalid
	 */
	public static CompanyUpdateType fromString(String symbol) {
		return stringToEnum.get(symbol);
	}
}
