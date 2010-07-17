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

package com.liferay.portlet.messageboards.model;

import com.liferay.portal.kernel.annotation.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the MBMailingList service. Represents a row in the &quot;MBMailingList&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.portlet.messageboards.model.impl.MBMailingListModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. All helper methods and application logic should be put in {@link com.liferay.portlet.messageboards.model.impl.MBMailingListImpl}.
 * </p>
 *
 * <p>
 * Never reference this interface directly. All methods that expect a  m b mailing list model instance should use the {@link MBMailingList} interface instead.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       MBMailingList
 * @see       com.liferay.portlet.messageboards.model.impl.MBMailingListImpl
 * @see       com.liferay.portlet.messageboards.model.impl.MBMailingListModelImpl
 * @generated
 */
public interface MBMailingListModel extends BaseModel<MBMailingList> {
	/**
	 * Gets the primary key of this  m b mailing list.
	 *
	 * @return the primary key of this  m b mailing list
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this  m b mailing list
	 *
	 * @param pk the primary key of this  m b mailing list
	 */
	public void setPrimaryKey(long pk);

	/**
	 * Gets the uuid of this  m b mailing list.
	 *
	 * @return the uuid of this  m b mailing list
	 */
	@AutoEscape
	public String getUuid();

	/**
	 * Sets the uuid of this  m b mailing list.
	 *
	 * @param uuid the uuid of this  m b mailing list
	 */
	public void setUuid(String uuid);

	/**
	 * Gets the mailing list id of this  m b mailing list.
	 *
	 * @return the mailing list id of this  m b mailing list
	 */
	public long getMailingListId();

	/**
	 * Sets the mailing list id of this  m b mailing list.
	 *
	 * @param mailingListId the mailing list id of this  m b mailing list
	 */
	public void setMailingListId(long mailingListId);

	/**
	 * Gets the group id of this  m b mailing list.
	 *
	 * @return the group id of this  m b mailing list
	 */
	public long getGroupId();

	/**
	 * Sets the group id of this  m b mailing list.
	 *
	 * @param groupId the group id of this  m b mailing list
	 */
	public void setGroupId(long groupId);

	/**
	 * Gets the company id of this  m b mailing list.
	 *
	 * @return the company id of this  m b mailing list
	 */
	public long getCompanyId();

	/**
	 * Sets the company id of this  m b mailing list.
	 *
	 * @param companyId the company id of this  m b mailing list
	 */
	public void setCompanyId(long companyId);

	/**
	 * Gets the user id of this  m b mailing list.
	 *
	 * @return the user id of this  m b mailing list
	 */
	public long getUserId();

	/**
	 * Sets the user id of this  m b mailing list.
	 *
	 * @param userId the user id of this  m b mailing list
	 */
	public void setUserId(long userId);

	/**
	 * Gets the user uuid of this  m b mailing list.
	 *
	 * @return the user uuid of this  m b mailing list
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this  m b mailing list.
	 *
	 * @param userUuid the user uuid of this  m b mailing list
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Gets the user name of this  m b mailing list.
	 *
	 * @return the user name of this  m b mailing list
	 */
	@AutoEscape
	public String getUserName();

	/**
	 * Sets the user name of this  m b mailing list.
	 *
	 * @param userName the user name of this  m b mailing list
	 */
	public void setUserName(String userName);

	/**
	 * Gets the create date of this  m b mailing list.
	 *
	 * @return the create date of this  m b mailing list
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this  m b mailing list.
	 *
	 * @param createDate the create date of this  m b mailing list
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Gets the modified date of this  m b mailing list.
	 *
	 * @return the modified date of this  m b mailing list
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this  m b mailing list.
	 *
	 * @param modifiedDate the modified date of this  m b mailing list
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Gets the category id of this  m b mailing list.
	 *
	 * @return the category id of this  m b mailing list
	 */
	public long getCategoryId();

	/**
	 * Sets the category id of this  m b mailing list.
	 *
	 * @param categoryId the category id of this  m b mailing list
	 */
	public void setCategoryId(long categoryId);

	/**
	 * Gets the email address of this  m b mailing list.
	 *
	 * @return the email address of this  m b mailing list
	 */
	@AutoEscape
	public String getEmailAddress();

	/**
	 * Sets the email address of this  m b mailing list.
	 *
	 * @param emailAddress the email address of this  m b mailing list
	 */
	public void setEmailAddress(String emailAddress);

	/**
	 * Gets the in protocol of this  m b mailing list.
	 *
	 * @return the in protocol of this  m b mailing list
	 */
	@AutoEscape
	public String getInProtocol();

	/**
	 * Sets the in protocol of this  m b mailing list.
	 *
	 * @param inProtocol the in protocol of this  m b mailing list
	 */
	public void setInProtocol(String inProtocol);

	/**
	 * Gets the in server name of this  m b mailing list.
	 *
	 * @return the in server name of this  m b mailing list
	 */
	@AutoEscape
	public String getInServerName();

	/**
	 * Sets the in server name of this  m b mailing list.
	 *
	 * @param inServerName the in server name of this  m b mailing list
	 */
	public void setInServerName(String inServerName);

	/**
	 * Gets the in server port of this  m b mailing list.
	 *
	 * @return the in server port of this  m b mailing list
	 */
	public int getInServerPort();

	/**
	 * Sets the in server port of this  m b mailing list.
	 *
	 * @param inServerPort the in server port of this  m b mailing list
	 */
	public void setInServerPort(int inServerPort);

	/**
	 * Gets the in use s s l of this  m b mailing list.
	 *
	 * @return the in use s s l of this  m b mailing list
	 */
	public boolean getInUseSSL();

	/**
	 * Determines whether this  m b mailing list is in use s s l.
	 *
	 * @return whether this  m b mailing list is in use s s l
	 */
	public boolean isInUseSSL();

	/**
	 * Sets the in use s s l of this  m b mailing list.
	 *
	 * @param inUseSSL the in use s s l of this  m b mailing list
	 */
	public void setInUseSSL(boolean inUseSSL);

	/**
	 * Gets the in user name of this  m b mailing list.
	 *
	 * @return the in user name of this  m b mailing list
	 */
	@AutoEscape
	public String getInUserName();

	/**
	 * Sets the in user name of this  m b mailing list.
	 *
	 * @param inUserName the in user name of this  m b mailing list
	 */
	public void setInUserName(String inUserName);

	/**
	 * Gets the in password of this  m b mailing list.
	 *
	 * @return the in password of this  m b mailing list
	 */
	@AutoEscape
	public String getInPassword();

	/**
	 * Sets the in password of this  m b mailing list.
	 *
	 * @param inPassword the in password of this  m b mailing list
	 */
	public void setInPassword(String inPassword);

	/**
	 * Gets the in read interval of this  m b mailing list.
	 *
	 * @return the in read interval of this  m b mailing list
	 */
	public int getInReadInterval();

	/**
	 * Sets the in read interval of this  m b mailing list.
	 *
	 * @param inReadInterval the in read interval of this  m b mailing list
	 */
	public void setInReadInterval(int inReadInterval);

	/**
	 * Gets the out email address of this  m b mailing list.
	 *
	 * @return the out email address of this  m b mailing list
	 */
	@AutoEscape
	public String getOutEmailAddress();

	/**
	 * Sets the out email address of this  m b mailing list.
	 *
	 * @param outEmailAddress the out email address of this  m b mailing list
	 */
	public void setOutEmailAddress(String outEmailAddress);

	/**
	 * Gets the out custom of this  m b mailing list.
	 *
	 * @return the out custom of this  m b mailing list
	 */
	public boolean getOutCustom();

	/**
	 * Determines whether this  m b mailing list is out custom.
	 *
	 * @return whether this  m b mailing list is out custom
	 */
	public boolean isOutCustom();

	/**
	 * Sets the out custom of this  m b mailing list.
	 *
	 * @param outCustom the out custom of this  m b mailing list
	 */
	public void setOutCustom(boolean outCustom);

	/**
	 * Gets the out server name of this  m b mailing list.
	 *
	 * @return the out server name of this  m b mailing list
	 */
	@AutoEscape
	public String getOutServerName();

	/**
	 * Sets the out server name of this  m b mailing list.
	 *
	 * @param outServerName the out server name of this  m b mailing list
	 */
	public void setOutServerName(String outServerName);

	/**
	 * Gets the out server port of this  m b mailing list.
	 *
	 * @return the out server port of this  m b mailing list
	 */
	public int getOutServerPort();

	/**
	 * Sets the out server port of this  m b mailing list.
	 *
	 * @param outServerPort the out server port of this  m b mailing list
	 */
	public void setOutServerPort(int outServerPort);

	/**
	 * Gets the out use s s l of this  m b mailing list.
	 *
	 * @return the out use s s l of this  m b mailing list
	 */
	public boolean getOutUseSSL();

	/**
	 * Determines whether this  m b mailing list is out use s s l.
	 *
	 * @return whether this  m b mailing list is out use s s l
	 */
	public boolean isOutUseSSL();

	/**
	 * Sets the out use s s l of this  m b mailing list.
	 *
	 * @param outUseSSL the out use s s l of this  m b mailing list
	 */
	public void setOutUseSSL(boolean outUseSSL);

	/**
	 * Gets the out user name of this  m b mailing list.
	 *
	 * @return the out user name of this  m b mailing list
	 */
	@AutoEscape
	public String getOutUserName();

	/**
	 * Sets the out user name of this  m b mailing list.
	 *
	 * @param outUserName the out user name of this  m b mailing list
	 */
	public void setOutUserName(String outUserName);

	/**
	 * Gets the out password of this  m b mailing list.
	 *
	 * @return the out password of this  m b mailing list
	 */
	@AutoEscape
	public String getOutPassword();

	/**
	 * Sets the out password of this  m b mailing list.
	 *
	 * @param outPassword the out password of this  m b mailing list
	 */
	public void setOutPassword(String outPassword);

	/**
	 * Gets the active of this  m b mailing list.
	 *
	 * @return the active of this  m b mailing list
	 */
	public boolean getActive();

	/**
	 * Determines whether this  m b mailing list is active.
	 *
	 * @return whether this  m b mailing list is active
	 */
	public boolean isActive();

	/**
	 * Sets the active of this  m b mailing list.
	 *
	 * @param active the active of this  m b mailing list
	 */
	public void setActive(boolean active);

	/**
	 * Gets a copy of this  m b mailing list as an escaped model instance by wrapping it with an {@link com.liferay.portal.kernel.bean.AutoEscapeBeanHandler}.
	 *
	 * @return the escaped model instance
	 * @see com.liferay.portal.kernel.bean.AutoEscapeBeanHandler
	 */
	public MBMailingList toEscapedModel();

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

	public int compareTo(MBMailingList mbMailingList);

	public int hashCode();

	public String toString();

	public String toXmlString();
}