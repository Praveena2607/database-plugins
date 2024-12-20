/*
 * Copyright © 2024 Cask Data, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package io.cdap.plugin.cloudsql.postgres;

import io.cdap.plugin.postgres.PostgresErrorDetailsProvider;
import io.cdap.plugin.util.DBUtils;

/**
 * A custom ErrorDetailsProvider for CloudSQL PostgreSQL plugin.
 */
public class CloudSQLPostgreSQLErrorDetailsProvider extends PostgresErrorDetailsProvider {
  @Override
  protected String getExternalDocumentationLink() {
    return DBUtils.CLOUDSQLPOSTGRES_SUPPORTED_DOC_URL;
  }
}
