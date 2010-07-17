/**
 * Copyright (c) 2000-2010 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portal.model;

import com.liferay.portal.kernel.annotation.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Subscription service. Represents a row in the &quot;Subscription&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.portal.model.impl.SubscriptionModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. All helper methods and application logic should be put in {@link com.liferay.portal.model.impl.SubscriptionImpl}.
 * </p>
 *
 * <p>
 * Never reference this interface directly. All methods that expect a  subscription model instance should use the {@link Subscription} interface instead.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       Subscription
 * @see       com.liferay.portal.model.impl.SubscriptionImpl
 * @see       com.liferay.portal.model.impl.SubscriptionModelImpl
 * @generated
 */
public interface SubscriptionModel extends BaseModel<Subscription> {
	/**
	 * Gets the primary key of this  subscription.
	 *
	 * @return the primary key of this  subscription
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this  subscription
	 *
	 * @param pk the primary key of this  subscription
	 */
	public void setPrimaryKey(long pk);

	/**
	 * Gets the subscription id of this  subscription.
	 *
	 * @return the subscription id of this  subscription
	 */
	public long getSubscriptionId();

	/**
	 * Sets the subscription id of this  subscription.
	 *
	 * @param subscriptionId the subscription id of this  subscription
	 */
	public void setSubscriptionId(long subscriptionId);

	/**
	 * Gets the company id of this  subscription.
	 *
	 * @return the company id of this  subscription
	 */
	public long getCompanyId();

	/**
	 * Sets the company id of this  subscription.
	 *
	 * @param companyId the company id of this  subscription
	 */
	public void setCompanyId(long companyId);

	/**
	 * Gets the user id of this  subscription.
	 *
	 * @return the user id of this  subscription
	 */
	public long getUserId();

	/**
	 * Sets the user id of this  subscription.
	 *
	 * @param userId the user id of this  subscription
	 */
	public void setUserId(long userId);

	/**
	 * Gets the user uuid of this  subscription.
	 *
	 * @return the user uuid of this  subscription
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this  subscription.
	 *
	 * @param userUuid the user uuid of this  subscription
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Gets the user name of this  subscription.
	 *
	 * @return the user name of this  subscription
	 */
	@AutoEscape
	public String getUserName();

	/**
	 * Sets the user name of this  subscription.
	 *
	 * @param userName the user name of this  subscription
	 */
	public void setUserName(String userName);

	/**
	 * Gets the create date of this  subscription.
	 *
	 * @return the create date of this  subscription
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this  subscription.
	 *
	 * @param createDate the create date of this  subscription
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Gets the modified date of this  subscription.
	 *
	 * @return the modified date of this  subscription
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this  subscription.
	 *
	 * @param modifiedDate the modified date of this  subscription
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Gets the class name of the model instance this  subscription is associated with.
	 *
	 * @return the class name of the model instance this  subscription is associated with
	 */
	public String getClassName();

	/**
	 * Gets the class name id of this  subscription.
	 *
	 * @return the class name id of this  subscription
	 */
	public long getClassNameId();

	/**
	 * Sets the class name id of this  subscription.
	 *
	 * @param classNameId the class name id of this  subscription
	 */
	public void setClassNameId(long classNameId);

	/**
	 * Gets the class p k of this  subscription.
	 *
	 * @return the class p k of this  subscription
	 */
	public long getClassPK();

	/**
	 * Sets the class p k of this  subscription.
	 *
	 * @param classPK the class p k of this  subscription
	 */
	public void setClassPK(long classPK);

	/**
	 * Gets the frequency of this  subscription.
	 *
	 * @return the frequency of this  subscription
	 */
	@AutoEscape
	public String getFrequency();

	/**
	 * Sets the frequency of this  subscription.
	 *
	 * @param frequency the frequency of this  subscription
	 */
	public void setFrequency(String frequency);

	/**
	 * Gets a copy of this  subscription as an escaped model instance by wrapping it with an {@link com.liferay.portal.kernel.bean.AutoEscapeBeanHandler}.
	 *
	 * @return the escaped model instance
	 * @see com.liferay.portal.kernel.bean.AutoEscapeBeanHandler
	 */
	public Subscription toEscapedModel();

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public void setEscapedModel(boolean escapedModel);

	public Serializable getPrimaryKeyObj();

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(Subscription subscription);

	public int hashCode();

	public String toString();

	public String toXmlString();
}