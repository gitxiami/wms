package com.ea.core.model;

import java.util.Date;

public class Wslog {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AD_WSLOG.ID
     *
     * @mbggenerated Tue Jan 10 16:12:43 CST 2012
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AD_WSLOG.ADDRESS
     *
     * @mbggenerated Tue Jan 10 16:12:43 CST 2012
     */
    private String address;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AD_WSLOG.HEADING
     *
     * @mbggenerated Tue Jan 10 16:12:43 CST 2012
     */
    private String heading;
    
    private String action;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AD_WSLOG.CONTENTTYPE
     *
     * @mbggenerated Tue Jan 10 16:12:43 CST 2012
     */
    private String contenttype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AD_WSLOG.ENCODING
     *
     * @mbggenerated Tue Jan 10 16:12:43 CST 2012
     */
    private String encoding;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AD_WSLOG.HTTPMETHOD
     *
     * @mbggenerated Tue Jan 10 16:12:43 CST 2012
     */
    private String httpmethod;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AD_WSLOG.HEADER
     *
     * @mbggenerated Tue Jan 10 16:12:43 CST 2012
     */
    private String header;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AD_WSLOG.MESSAGE
     *
     * @mbggenerated Tue Jan 10 16:12:43 CST 2012
     */
    private String message;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AD_WSLOG.PAYLOAD
     *
     * @mbggenerated Tue Jan 10 16:12:43 CST 2012
     */
    private String payload;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AD_WSLOG.RESPONSECODE
     *
     * @mbggenerated Tue Jan 10 16:12:43 CST 2012
     */
    private String responsecode;

    
    private Date created;
    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AD_WSLOG.ID
     *
     * @return the value of AD_WSLOG.ID
     *
     * @mbggenerated Tue Jan 10 16:12:43 CST 2012
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AD_WSLOG.ID
     *
     * @param id the value for AD_WSLOG.ID
     *
     * @mbggenerated Tue Jan 10 16:12:43 CST 2012
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AD_WSLOG.ADDRESS
     *
     * @return the value of AD_WSLOG.ADDRESS
     *
     * @mbggenerated Tue Jan 10 16:12:43 CST 2012
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AD_WSLOG.ADDRESS
     *
     * @param address the value for AD_WSLOG.ADDRESS
     *
     * @mbggenerated Tue Jan 10 16:12:43 CST 2012
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AD_WSLOG.HEADING
     *
     * @return the value of AD_WSLOG.HEADING
     *
     * @mbggenerated Tue Jan 10 16:12:43 CST 2012
     */
    public String getHeading() {
        return heading;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AD_WSLOG.HEADING
     *
     * @param heading the value for AD_WSLOG.HEADING
     *
     * @mbggenerated Tue Jan 10 16:12:43 CST 2012
     */
    public void setHeading(String heading) {
        this.heading = heading == null ? null : heading.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AD_WSLOG.CONTENTTYPE
     *
     * @return the value of AD_WSLOG.CONTENTTYPE
     *
     * @mbggenerated Tue Jan 10 16:12:43 CST 2012
     */
    public String getContenttype() {
        return contenttype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AD_WSLOG.CONTENTTYPE
     *
     * @param contenttype the value for AD_WSLOG.CONTENTTYPE
     *
     * @mbggenerated Tue Jan 10 16:12:43 CST 2012
     */
    public void setContenttype(String contenttype) {
        this.contenttype = contenttype == null ? null : contenttype.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AD_WSLOG.ENCODING
     *
     * @return the value of AD_WSLOG.ENCODING
     *
     * @mbggenerated Tue Jan 10 16:12:43 CST 2012
     */
    public String getEncoding() {
        return encoding;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AD_WSLOG.ENCODING
     *
     * @param encoding the value for AD_WSLOG.ENCODING
     *
     * @mbggenerated Tue Jan 10 16:12:43 CST 2012
     */
    public void setEncoding(String encoding) {
        this.encoding = encoding == null ? null : encoding.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AD_WSLOG.HTTPMETHOD
     *
     * @return the value of AD_WSLOG.HTTPMETHOD
     *
     * @mbggenerated Tue Jan 10 16:12:43 CST 2012
     */
    public String getHttpmethod() {
        return httpmethod;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AD_WSLOG.HTTPMETHOD
     *
     * @param httpmethod the value for AD_WSLOG.HTTPMETHOD
     *
     * @mbggenerated Tue Jan 10 16:12:43 CST 2012
     */
    public void setHttpmethod(String httpmethod) {
        this.httpmethod = httpmethod == null ? null : httpmethod.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AD_WSLOG.HEADER
     *
     * @return the value of AD_WSLOG.HEADER
     *
     * @mbggenerated Tue Jan 10 16:12:43 CST 2012
     */
    public String getHeader() {
        return header;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AD_WSLOG.HEADER
     *
     * @param header the value for AD_WSLOG.HEADER
     *
     * @mbggenerated Tue Jan 10 16:12:43 CST 2012
     */
    public void setHeader(String header) {
        this.header = header == null ? null : header.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AD_WSLOG.MESSAGE
     *
     * @return the value of AD_WSLOG.MESSAGE
     *
     * @mbggenerated Tue Jan 10 16:12:43 CST 2012
     */
    public String getMessage() {
        return message;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AD_WSLOG.MESSAGE
     *
     * @param message the value for AD_WSLOG.MESSAGE
     *
     * @mbggenerated Tue Jan 10 16:12:43 CST 2012
     */
    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AD_WSLOG.PAYLOAD
     *
     * @return the value of AD_WSLOG.PAYLOAD
     *
     * @mbggenerated Tue Jan 10 16:12:43 CST 2012
     */
    public String getPayload() {
        return payload;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AD_WSLOG.PAYLOAD
     *
     * @param payload the value for AD_WSLOG.PAYLOAD
     *
     * @mbggenerated Tue Jan 10 16:12:43 CST 2012
     */
    public void setPayload(String payload) {
        this.payload = payload;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AD_WSLOG.RESPONSECODE
     *
     * @return the value of AD_WSLOG.RESPONSECODE
     *
     * @mbggenerated Tue Jan 10 16:12:43 CST 2012
     */
    public String getResponsecode() {
        return responsecode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AD_WSLOG.RESPONSECODE
     *
     * @param responsecode the value for AD_WSLOG.RESPONSECODE
     *
     * @mbggenerated Tue Jan 10 16:12:43 CST 2012
     */
    public void setResponsecode(String responsecode) {
        this.responsecode = responsecode == null ? null : responsecode.trim();
    }

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

    @Override
    public String toString() {
        return "Wslog{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", heading='" + heading + '\'' +
                ", action='" + action + '\'' +
                ", contenttype='" + contenttype + '\'' +
                ", encoding='" + encoding + '\'' +
                ", httpmethod='" + httpmethod + '\'' +
                ", header='" + header + '\'' +
                ", message='" + message + '\'' +
                ", payload='" + payload + '\'' +
                ", responsecode='" + responsecode + '\'' +
                ", created=" + created +
                '}';
    }
}