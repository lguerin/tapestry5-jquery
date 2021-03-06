//
// Copyright 2010 GOT5 (Gang Of Tapestry 5)
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// 	http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
//

package org.got5.tapestry5.jquery.test.components;

import org.apache.tapestry5.annotations.Parameter;
import org.apache.tapestry5.corelib.base.AbstractConditional;

/**
 * Check the nullity of a property.
 */
public class IfNotNull extends AbstractConditional
{

    /**
     * If true, then the body of the If component is rendered. If false, the
     * body is omitted.
     */
    @Parameter(required = true)
    private Object test;

    /**
     * Optional parameter to invert the test. If true, then the body is rendered
     * when the test parameter is false (not true).
     * 
     * @see Unless
     */
    @Parameter
    private boolean negate;

    /**
     * @return test parameter (if negate is false), or test parameter inverted
     *         (if negate is true)
     */
    protected boolean test()
    {
	if (negate)
	{
	    return test == null;
	}
	return test != null;
    }
}