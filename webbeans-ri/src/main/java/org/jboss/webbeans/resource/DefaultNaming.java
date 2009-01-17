/*
 * JBoss, Home of Professional Open Source
 * Copyright 2008, Red Hat Middleware LLC, and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,  
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jboss.webbeans.resource;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.webbeans.ExecutionException;

/**
 * The default naming provider
 * 
 * @author Pete Muir
 */
public class DefaultNaming extends AbstractNamingContext
{
   private static final long serialVersionUID = 1L;
   // The initial lookup context
   private transient InitialContext initialContext;

   /**
    * Constructor
    */
   public DefaultNaming()
   {
      try
      {
         this.initialContext = new InitialContext();
      }
      catch (NamingException e)
      {
         throw new ExecutionException("Could not obtain InitialContext", e);
      }
   }

   /**
    * Gets the initial context
    * 
    * @return The initial context
    */
   public InitialContext getContext()
   {
      return initialContext;
   }

}
