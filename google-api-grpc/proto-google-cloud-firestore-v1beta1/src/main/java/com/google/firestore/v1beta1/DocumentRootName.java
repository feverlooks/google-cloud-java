/*
 * Copyright 2018 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package com.google.firestore.v1beta1;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.google.api.pathtemplate.PathTemplate;
import com.google.api.resourcenames.ResourceName;
import com.google.api.resourcenames.ResourceNameType;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

// AUTO-GENERATED DOCUMENTATION AND CLASS
@javax.annotation.Generated("by GAPIC protoc plugin")
public class DocumentRootName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("projects/{project}/databases/{database}/documents");

  private volatile Map<String, String> fieldValuesMap;

  private final String project;
  private final String database;

  public String getProject() {
    return project;
  }

  public String getDatabase() {
    return database;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private DocumentRootName(Builder builder) {
    project = Preconditions.checkNotNull(builder.getProject());
    database = Preconditions.checkNotNull(builder.getDatabase());
  }

  public static DocumentRootName of(String project, String database) {
    return newBuilder()
      .setProject(project)
      .setDatabase(database)
      .build();
  }

  public static String format(String project, String database) {
    return newBuilder()
      .setProject(project)
      .setDatabase(database)
      .build()
      .toString();
  }

  public static DocumentRootName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "DocumentRootName.parse: formattedString not in valid format");
    return of(matchMap.get("project"), matchMap.get("database"));
  }

  public static List<DocumentRootName> parseList(List<String> formattedStrings) {
    List<DocumentRootName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<DocumentRootName> values) {
    List<String> list = new ArrayList<String>(values.size());
    for (DocumentRootName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return PATH_TEMPLATE.matches(formattedString);
  }

  public Map<String, String> getFieldValuesMap() {
    if (fieldValuesMap == null) {
      synchronized (this) {
        if (fieldValuesMap == null) {
          ImmutableMap.Builder<String, String> fieldMapBuilder = ImmutableMap.builder();
          fieldMapBuilder.put("project", project);
          fieldMapBuilder.put("database", database);
          fieldValuesMap = fieldMapBuilder.build();
        }
      }
    }
    return fieldValuesMap;
  }

  public String getFieldValue(String fieldName) {
    return getFieldValuesMap().get(fieldName);
  }

  /**
   * @deprecated This method is only present to satisfy the ResourceName interface.
   */
  @Deprecated
  public ResourceNameType getType() {
    throw new UnsupportedOperationException("DocumentRootName.getType() not supported");
  }

  @Override
  public String toString() {
    return PATH_TEMPLATE.instantiate("project", project, "database", database);
  }

  /** Builder for DocumentRootName. */
  public static class Builder {

    private String project;
    private String database;

    public String getProject() {
      return project;
    }

    public String getDatabase() {
      return database;
    }

    public Builder setProject(String project) {
      this.project = project;
      return this;
    }

    public Builder setDatabase(String database) {
      this.database = database;
      return this;
    }

    private Builder() {
    }

    private Builder(DocumentRootName documentRootName) {
      project = documentRootName.project;
      database = documentRootName.database;
    }

    public DocumentRootName build() {
      return new DocumentRootName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof DocumentRootName) {
      DocumentRootName that = (DocumentRootName) o;
      return (this.project.equals(that.project))
          && (this.database.equals(that.database));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= project.hashCode();
    h *= 1000003;
    h ^= database.hashCode();
    return h;
  }
}

