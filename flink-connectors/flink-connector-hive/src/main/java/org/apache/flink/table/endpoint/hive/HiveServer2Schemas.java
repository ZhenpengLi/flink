/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.flink.table.endpoint.hive;

import org.apache.flink.table.api.DataTypes;
import org.apache.flink.table.catalog.Column;
import org.apache.flink.table.catalog.ResolvedSchema;

import java.util.Collections;

/** Schemas for the HiveServer2 Endpoint result. */
public class HiveServer2Schemas {

    /** Schema for {@link HiveServer2Endpoint#GetCatalogs}. */
    public static final ResolvedSchema GET_CATALOGS_SCHEMA =
            new ResolvedSchema(
                    Collections.singletonList(
                            Column.physical("TABLE_CAT", DataTypes.STRING())
                                    .withComment("Catalog name. NULL if not applicable.")),
                    Collections.emptyList(),
                    null);
}
