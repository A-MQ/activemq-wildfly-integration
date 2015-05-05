/*
 * Copyright 2005-2014 Red Hat, Inc.
 * Red Hat licenses this file to you under the Apache License, version
 * 2.0 (the "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *    http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.  See the License for the specific language governing
 * permissions and limitations under the License.
 */

package org.apache.activemq.artemis.wildfly.integration.tests;

import java.lang.reflect.Method;

import org.apache.activemq.artemis.service.extensions.ServiceUtils;
import org.apache.activemq.artemis.wildfly.integration.WildFlyActiveMQXAResourceWrapperFactory;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * @author <a href="mailto:mtaylor@redhat.com">Martyn Taylor</a>
 */

public class WildFlyActiveMQServiceUtils
{
   @Test
   public void testServiceUtilsReturnsWildFlyActiveMQXAResourceWrapperFactory() throws Exception
   {
      Method method = ServiceUtils.class.getDeclaredMethod("getActiveMQXAResourceWrapperFactory");
      method.setAccessible(true);
      assertEquals(WildFlyActiveMQXAResourceWrapperFactory.class, method.invoke(null).getClass());
   }
}
