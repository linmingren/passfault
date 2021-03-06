/* ©Copyright 2011 Cameron Morris
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.owasp.passfault.api;

/**
 * Implementations will analyze a collection of passwords to determine the most likely, or easiest to crack patterns.
 *
 * @author cam, ray
 */
public interface PatternsAnalyzer {

  /**
   * Calculates the highest probable combination of finders.  In other words,
   * the weakest combination of found patterns.
   * @param patterns a collection of patterns to analyze
   * @return List of finders that make up the weakest combination of found passwords
   */
  AnalysisResult analyze(PatternCollection patterns);

}
