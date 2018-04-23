package com.lwl.boot.model;

import java.io.Serializable;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(chain = true)
public class Users implements Serializable {
	private static final long serialVersionUID = 1L;

	private long id;
	
	private String name;
	
	private Date indate;
	
}
