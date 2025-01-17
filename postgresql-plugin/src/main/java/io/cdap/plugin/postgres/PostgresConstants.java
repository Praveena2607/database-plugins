/*
 * Copyright © 2019 Cask Data, Inc.
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

package io.cdap.plugin.postgres;

import io.cdap.cdap.api.exception.ErrorCategory;
import io.cdap.cdap.api.exception.ErrorType;
import io.cdap.cdap.api.exception.ErrorUtils;

/**
 * Postgres constants.
 */
public final class PostgresConstants {

  private PostgresConstants() {
    String errorMessage = "Should not instantiate static utility class.";
    throw ErrorUtils.getProgramFailureException(new ErrorCategory(ErrorCategory.ErrorCategoryEnum.PLUGIN),
      errorMessage, errorMessage, ErrorType.SYSTEM, false, new AssertionError(errorMessage));
  }

  public static final String PLUGIN_NAME = "Postgres";
  public static final String CONNECTION_TIMEOUT = "connectionTimeout";
  public static final String POSTGRES_CONNECTION_STRING_WITH_DB_FORMAT = "jdbc:postgresql://%s:%s/%s";
}
