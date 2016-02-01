/*! ******************************************************************************
 *
 * Pentaho Data Integration
 *
 * Copyright (C) 2002-2015 by Pentaho : http://www.pentaho.com
 *
 *******************************************************************************
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ******************************************************************************/

package org.pentaho.di.core.injection;

@InjectionSupported( localizationPrefix = "", groups = { "FILENAME_LINES", "FILENAME_LINES2" } )
public class MetaBeanLevel1 {

  @InjectionDeep
  private MetaBeanLevel2 sub;

  @Injection( name = "FBOOLEAN" )
  public boolean fboolean;
  @Injection( name = "FINT" )
  public int fint;
  @Injection( name = "FLONG" )
  public long flong;

  public MetaBeanLevel2 getSub() {
    return sub;
  }
}