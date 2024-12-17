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

package io.cdap.plugin.cloudsql.mysql;


import io.cdap.plugin.mysql.MysqlErrorDetailsProvider;

/**
 * A custom ErrorDetailsProvider for CloudSQL MySQL plugins.
 */
public class CloudSQLMySQLErrorDetailsProvider extends MysqlErrorDetailsProvider {

  @Override
  protected String getExternalDocumentationLink() {
    return "https://cloud.google.com/sql/docs/mysql/error-messages";
  }
}
