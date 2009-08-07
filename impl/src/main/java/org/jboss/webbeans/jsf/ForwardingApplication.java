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
package org.jboss.webbeans.jsf;

import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

import javax.faces.FacesException;
import javax.faces.application.Application;
import javax.faces.application.NavigationHandler;
import javax.faces.application.StateManager;
import javax.faces.application.ViewHandler;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.el.MethodBinding;
import javax.faces.el.PropertyResolver;
import javax.faces.el.ReferenceSyntaxException;
import javax.faces.el.ValueBinding;
import javax.faces.el.VariableResolver;
import javax.faces.event.ActionListener;
import javax.faces.validator.Validator;

/**
 * @author pmuir
 *
 */
public abstract class ForwardingApplication extends Application
{
   
   protected abstract Application delegate();

   @Override
   public void addComponent(String componentType, String componentClass)
   {
      delegate().addComponent(componentType, componentClass);
   }

   @Override
   public void addConverter(String converterId, String converterClass)
   {
      delegate().addConverter(converterId, converterClass);
   }

   @SuppressWarnings("unchecked")
   @Override
   public void addConverter(Class targetClass, String converterClass)
   {
      delegate().addConverter(targetClass, converterClass);
   }

   @Override
   public void addValidator(String validatorId, String validatorClass)
   {
      delegate().addValidator(validatorId, validatorClass);
   }

   @Override
   public UIComponent createComponent(String componentType) throws FacesException
   {
      return delegate().createComponent(componentType);
   }

   @Override
   @Deprecated
   public UIComponent createComponent(ValueBinding componentBinding, FacesContext context, String componentType) throws FacesException
   {
      return delegate().createComponent(componentBinding, context, componentType);
   }

   @Override
   public Converter createConverter(String converterId)
   {
      return delegate().createConverter(converterId);
   }

   @SuppressWarnings("unchecked")
   @Override
   public Converter createConverter(Class targetClass)
   {
      return delegate().createConverter(targetClass);
   }

   @SuppressWarnings("unchecked")
   @Deprecated
   @Override
   public MethodBinding createMethodBinding(String ref, Class[] params) throws ReferenceSyntaxException
   {
      return delegate().createMethodBinding(ref, params);
   }

   @Override
   public Validator createValidator(String validatorId) throws FacesException
   {
      return delegate().createValidator(validatorId);
   }

   @Override
   @Deprecated
   public ValueBinding createValueBinding(String ref) throws ReferenceSyntaxException
   {
      return delegate().createValueBinding(ref);
   }

   @Override
   public ActionListener getActionListener()
   {
      return delegate().getActionListener();
   }

   @Override
   public Iterator<String> getComponentTypes()
   {
      return delegate().getComponentTypes();
   }

   @Override
   public Iterator<String> getConverterIds()
   {
      return delegate().getConverterIds();
   }

   @SuppressWarnings("unchecked")
   @Override
   public Iterator<Class> getConverterTypes()
   {
      return delegate().getConverterTypes();
   }

   @Override
   public Locale getDefaultLocale()
   {
      return delegate().getDefaultLocale();
   }

   @Override
   public String getDefaultRenderKitId()
   {
      return delegate().getDefaultRenderKitId();
   }

   @Override
   public String getMessageBundle()
   {
      return delegate().getMessageBundle();
   }

   @Override
   public NavigationHandler getNavigationHandler()
   {
      return delegate().getNavigationHandler();
   }

   @Override
   @Deprecated
   public PropertyResolver getPropertyResolver()
   {
      return delegate().getPropertyResolver();
   }

   @Override
   public StateManager getStateManager()
   {
      return delegate().getStateManager();
   }

   @Override
   public Iterator<Locale> getSupportedLocales()
   {
      return delegate().getSupportedLocales();
   }

   @Override
   public Iterator<String> getValidatorIds()
   {
      return delegate().getValidatorIds();
   }

   @Override
   @Deprecated
   public VariableResolver getVariableResolver()
   {
      return delegate().getVariableResolver();
   }

   @Override
   public ViewHandler getViewHandler()
   {
      return delegate().getViewHandler();
   }

   @Override
   public void setActionListener(ActionListener listener)
   {
      delegate().setActionListener(listener);
   }

   @Override
   public void setDefaultLocale(Locale locale)
   {
      delegate().setDefaultLocale(locale);
   }

   @Override
   public void setDefaultRenderKitId(String renderKitId)
   {
      delegate().setDefaultRenderKitId(renderKitId);
   }

   @Override
   public void setMessageBundle(String bundle)
   {
      delegate().setMessageBundle(bundle);
   }

   @Override
   public void setNavigationHandler(NavigationHandler handler)
   {
      delegate().setNavigationHandler(handler);
   }


   @Override
   @Deprecated
   public void setPropertyResolver(PropertyResolver resolver)
   {
      delegate().setPropertyResolver(resolver);
   }

   @Override
   public void setStateManager(StateManager manager)
   {
      delegate().setStateManager(manager);
   }

   @Override
   public void setSupportedLocales(Collection<Locale> locales)
   {
      delegate().setSupportedLocales(locales);

   }

   @Override
   @Deprecated
   public void setVariableResolver(VariableResolver resolver)
   {
      delegate().setVariableResolver(resolver);
   }

   @Override
   public void setViewHandler(ViewHandler handler)
   {
      delegate().setViewHandler(handler);
   }
   
   @Override
   public boolean equals(Object obj)
   {
      return delegate().equals(obj);
   }
   
   @Override
   public int hashCode()
   {
      return delegate().hashCode();
   }
   
   @Override
   public String toString()
   {
      return delegate().toString();
   }

}
