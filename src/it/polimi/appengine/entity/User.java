/* Copyright (c) 2012 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package it.polimi.appengine.entity;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.jdo.annotations.Persistent;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.google.appengine.api.datastore.Key;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Key key;
	
	private String pwAccount;
	private String gmailAccount;
	private String fbAccount;
	private String authToken;
	private String photoURL;
	private String name;
	private String surname;
	private Date bday;
	@Persistent(mappedBy = "owner")
	private List<Request> requests;
	@Persistent
	private Set<Key> joinedReq;
	@Persistent(mappedBy = "from")
	private List<Feedback> receivedFb;
	@Persistent(mappedBy = "to")
	private List<Feedback> sentFb;
	
	public Key getKey() {
		return key;
	}
	public void setKey(Key key) {
		this.key = key;
	}
	public String getPwAccount() {
		return pwAccount;
	}
	public void setPwAccount(String pwAccount) {
		this.pwAccount = pwAccount;
	}
	public String getGmailAccount() {
		return gmailAccount;
	}
	public void setGmailAccount(String gmailAccount) {
		this.gmailAccount = gmailAccount;
	}
	public String getFbAccount() {
		return fbAccount;
	}
	public void setFbAccount(String fbAccount) {
		this.fbAccount = fbAccount;
	}
	public String getAuthToken() {
		return authToken;
	}
	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}
	public String getPhotoURL() {
		return photoURL;
	}
	public void setPhotoURL(String photoURL) {
		this.photoURL = photoURL;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public Date getBday() {
		return bday;
	}
	public void setBday(Date bday) {
		this.bday = bday;
	}
	public List<Request> getRequests() {
		return requests;
	}
	public void setRequests(List<Request> requests) {
		this.requests = requests;
	}
	public Set<Key> getJoinedReq() {
		return joinedReq;
	}
	public void setJoinedReq(Set<Key> joinedReq) {
		this.joinedReq = joinedReq;
	}
	public List<Feedback> getReceivedFb() {
		return receivedFb;
	}
	public void setReceivedFb(List<Feedback> receivedFb) {
		this.receivedFb = receivedFb;
	}
	public List<Feedback> getSentFb() {
		return sentFb;
	}
	public void setSentFb(List<Feedback> sentFb) {
		this.sentFb = sentFb;
	}
	
}