/*
 *  Copyright (c) 2018, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 */

package org.wso2.carbon.user.core.common;

import org.wso2.carbon.user.api.Permission;
import org.wso2.carbon.user.core.UserStoreException;
import org.wso2.carbon.user.core.UserStoreManager;
import org.wso2.carbon.user.core.listener.UserManagementErrorEventListener;

import java.util.Map;

/**
 * Abstract implementation of UserManagementErrorEventListener.
 */
public class AbstractUserManagementErrorListener implements UserManagementErrorEventListener {

    @Override
    public int getExecutionOrderId() {
        return 0;
    }

    @Override
    public boolean isEnable() {
        return false;
    }

    @Override
    public boolean onAuthenticateFailure(String errorCode, String errorMessage, String userName, Object credential,
            UserStoreManager userStoreManager) throws UserStoreException {
        return true;
    }

    @Override
    public boolean onAddUserFailure(String errorCode, String errorMessage, String userName, Object credential,
            String[] roleList, Map<String, String> claims, String profile, UserStoreManager userStoreManager)
            throws UserStoreException {
        return true;
    }

    @Override
    public boolean onUpdateCredentialFailure(String errorCode, String errorMessage, String userName,
            Object newCredential, Object oldCredential, UserStoreManager userStoreManager) throws UserStoreException {
        return true;
    }

    @Override
    public boolean onUpdateCredentialByAdminFailure(String errorCode, String errorMessage, String userName,
            Object newCredential, UserStoreManager userStoreManager) throws UserStoreException {
        return true;
    }

    @Override
    public boolean onDeleteUserFailure(String errorCode, String errorMessage, String userName,
            UserStoreManager userStoreManager) throws UserStoreException {
        return true;
    }

    @Override
    public boolean onSetUserClaimValueFailure(String errorCode, String errorMessage, String userName, String claimURI,
            String claimValue, String profileName, UserStoreManager userStoreManager) throws UserStoreException {
        return true;
    }

    @Override
    public boolean onSetUserClaimValuesFailure(String errorCode, String errorMessage, String userName,
            Map<String, String> claims, String profileName, UserStoreManager userStoreManager)
            throws UserStoreException {
        return true;
    }

    @Override
    public boolean onDeleteUserClaimValuesFailure(String errorCode, String errorMessage, String userName,
            String[] claims, String profileName, UserStoreManager userStoreManager) throws UserStoreException {
        return true;
    }

    @Override
    public boolean onDeleteUserClaimValueFailure(String errorCode, String errorMessage, String userName,
            String claimURI, String profileName, UserStoreManager userStoreManager) throws UserStoreException {
        return true;
    }

    @Override
    public boolean onAddRoleFailure(String errorCode, String errorMessage, String roleName, String[] userList,
            Permission[] permissions, UserStoreManager userStoreManager) throws UserStoreException {
        return true;
    }

    @Override
    public boolean onDeleteRoleFailure(String errorCode, String errorMessage, String roleName,
            UserStoreManager userStoreManager) throws UserStoreException {
        return true;
    }

    @Override
    public boolean onUpdateRoleNameFailure(String errorCode, String errorMessage, String roleName, String newRoleName,
            UserStoreManager userStoreManager) throws UserStoreException {
        return true;
    }

    @Override
    public boolean onUpdateUserListOfRoleFailure(String errorCode, String errorMessage, String roleName,
            String[] deletedUsers, String[] newUsers, UserStoreManager userStoreManager) throws UserStoreException {
        return true;
    }

    @Override
    public boolean onUpdateRoleListOfUserFailure(String errorCode, String errorMessage, String userName,
            String[] deletedRoles, String[] newRoles, UserStoreManager userStoreManager) throws UserStoreException {
        return true;
    }

    @Override
    public boolean onGetUserClaimValueFailure(String errorCode, String errorMessage, String userName, String claim,
            String profileName, UserStoreManager userStoreManager) throws UserStoreException {
        return true;
    }

    @Override
    public boolean onGetUserClaimValuesFailure(String errorCode, String errorMessage, String userName, String[] claims,
            String profileName, UserStoreManager userStoreManager) throws UserStoreException {
        return true;
    }

    @Override
    public boolean onGetUserListFailure(String errorCode, String errorMessage, String claim, String claimValue,
            String profileName, UserStoreManager userStoreManager) throws UserStoreException {
        return true;
    }

    @Override
    public boolean onUpdatePermissionsOfRoleFailure(String errorCode, String errorMessage, String roleName,
            Permission[] permissions, UserStoreManager userStoreManager) throws UserStoreException {
        return true;
    }

    @Override
    public boolean onGetUserCountFailure(String errorCode, String errorMessage, String claim, String claimValue,
                                        AbstractUserStoreManager abstractUserStoreManager) {
        return true;
    }

}
