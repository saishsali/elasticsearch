/*
 * Licensed to Elasticsearch under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.elasticsearch.ingest.processor.mutate;

import java.util.regex.Pattern;

/**
 * Represents a gsub expression containing the field name, the pattern to look for and its string replacement.
 */
public class GsubExpression {

    private final String fieldName;
    private final Pattern pattern;
    private final String replacement;

    public GsubExpression(String fieldName, Pattern pattern, String replacement) {
        this.fieldName = fieldName;
        this.pattern = pattern;
        this.replacement = replacement;
    }

    public String getFieldName() {
        return fieldName;
    }

    public Pattern getPattern() {
        return pattern;
    }

    public String getReplacement() {
        return replacement;
    }
}
