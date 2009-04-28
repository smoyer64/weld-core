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
package org.jboss.webbeans.persistence;

import java.lang.annotation.Annotation;

import org.jboss.webbeans.bootstrap.api.Service;
import org.jboss.webbeans.resources.spi.ResourceLoader;
import org.jboss.webbeans.util.ApiAbstraction;

public class PersistenceApiAbstraction extends ApiAbstraction implements Service
{

   public final Class<? extends Annotation> PERSISTENCE_CONTEXT_ANNOTATION_CLASS;
   public final Object EXTENDED_PERSISTENCE_CONTEXT_ENUM_VALUE;
   public final Class<?> PERSISTENCE_CONTEXT_TYPE_CLASS;
   public final Class<? extends Annotation> ENTITY_CLASS;
   public final Class<? extends Annotation> MAPPED_SUPERCLASS_CLASS;
   public final Class<? extends Annotation> EMBEDDABLE_CLASS;

   /**
    * @param resourceLoader
    */
   public PersistenceApiAbstraction(ResourceLoader resourceLoader)
   {
      super(resourceLoader);
      PERSISTENCE_CONTEXT_ANNOTATION_CLASS = annotationTypeForName("javax.persistence.PersistenceContext");
      PERSISTENCE_CONTEXT_TYPE_CLASS = classForName("javax.persistence.PersistenceContextType");
      if (PERSISTENCE_CONTEXT_TYPE_CLASS.getClass().equals( Dummy.class)) 
      {
         EXTENDED_PERSISTENCE_CONTEXT_ENUM_VALUE = enumValue(PERSISTENCE_CONTEXT_TYPE_CLASS, "EXTENDED");
      } 
      else
      {
         EXTENDED_PERSISTENCE_CONTEXT_ENUM_VALUE = DummyEnum.DUMMY_VALUE;
      }
      ENTITY_CLASS = annotationTypeForName("javax.persistence.Entity");
      MAPPED_SUPERCLASS_CLASS = annotationTypeForName("javax.persistence.MappedSuperclass");
      EMBEDDABLE_CLASS = annotationTypeForName("javax.persistence.Embeddable");
   }
   
}