package io.trophyroom.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "room")
public class Room {

	@Id
	private Integer id;

	private String name;

	private String total;

	private long createdDate = System.currentTimeMillis();
}
