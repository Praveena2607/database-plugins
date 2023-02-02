/*
 * Copyright © 2023 Cask Data, Inc.
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

package io.cdap.plugin.common.stepsdesign;

import io.cdap.e2e.utils.PluginPropertyUtils;
import io.cdap.plugin.OracleClient;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.sql.SQLException;

/**
 * Oracle test hooks.
 */
public class TestSetupHooks {

  @Before(order = 1, value = "@ORACLE_SOURCE_TEST")
  public static void setSelectQuery() {
    String sourceTable =  PluginPropertyUtils.pluginProp("sourceTable");
    String schema = PluginPropertyUtils.pluginProp("schema");
    PluginPropertyUtils.addPluginProp("selectQuery",
                                      PluginPropertyUtils.pluginProp("selectQuery").
                                        replace("${table}", sourceTable).replace("${schema}", schema));
  }

  @Before(order = 2, value = "@ORACLE_SOURCE_TEST")
  public static void createTables() throws SQLException, ClassNotFoundException {
    OracleClient.createSourceTable(PluginPropertyUtils.pluginProp("sourceTable"),
                                   PluginPropertyUtils.pluginProp("schema"));
    OracleClient.createTargetTable(PluginPropertyUtils.pluginProp("targetTable"),
                                   PluginPropertyUtils.pluginProp("schema"));
  }

  @After(order = 1, value = "@ORACLE_SINK_TEST")
  public static void dropTables() throws SQLException, ClassNotFoundException {
    OracleClient.deleteTables(PluginPropertyUtils.pluginProp("schema"),
                              new String[]{PluginPropertyUtils.pluginProp("sourceTable"),
                                PluginPropertyUtils.pluginProp("targetTable")});
  }

}