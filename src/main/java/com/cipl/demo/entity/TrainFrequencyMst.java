package com.cipl.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * @author Santosh Mahto
 *
 */
@Entity
@Table(name = "TRAIN_FREQUENCY_MST")
public class TrainFrequencyMst {
	
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name = "TRAIN_FREQUENCY_CODE")
		private Long trainFrequencyCd;
		
		
		@Column(name = "DESCRIPTION")
		private String descreption;


		public Long getTrainFrequencyCd() {
			return trainFrequencyCd;
		}


		public void setTrainFrequencyCd(Long trainFrequencyCd) {
			this.trainFrequencyCd = trainFrequencyCd;
		}


		public String getDescreption() {
			return descreption;
		}


		public void setDescreption(String descreption) {
			this.descreption = descreption;
		}
	

		
		
}
