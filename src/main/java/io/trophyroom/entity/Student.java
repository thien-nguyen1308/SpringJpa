package io.trophyroom.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
//@DynamicUpdate
@Table(name = "student")
public class Student {

	@Id
	private Integer id;

	private String name;

	private String phone;

	private long createdDate = System.currentTimeMillis();

	//	@OneToOne(fetch = FetchType.LAZY,  optional = false)
	@OneToOne
	@JoinColumn(name = "room_id")
	private Room room;
}
