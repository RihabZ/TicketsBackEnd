package com.rihab.interventions.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Ticket {
	@Id
    @Column(name = "INTE_CODE",columnDefinition = "VARCHAR(10) ", nullable = false)
    	private String interCode;
	
	@Column(name = "INTE_DESIGNATION",columnDefinition = "VARCHAR(50)", nullable = false)
    private String interDesignation;
	
	 @Column(name = "INTE_DECL_NUMERO_ORIG")
	    private Long declNumeroOrig;
	@Column(name = "INTE_INTS_CODE",columnDefinition = "VARCHAR(10) ")
    private String interStatut;
	
	 @Column(name = "INTE_DT_CREATION", nullable = false)
	    private Date dateCreation;

	    @Column(name = "INTE_DT_CLOTURE")
	    private Date dateCloture;

	    @Column(name = "INTE_DESCRIPTION_PANNE")
	    private String descriptionPanne;

	    @Column(name = "INTE_DESCRIPTION")
	    private String description;

	    @Column(name = "INTE_DATE_PREVUE")
	    private Date datePrevue;

	    @Column(name = "INTE_HEURE_PREVUE",columnDefinition = "VARCHAR(5) ")
	    private String heurePrevue;
	    
	    @Column(name = "INTE_DUREE_PREVUE")
	    private Integer dureePrevue;
	    
	    @Column(name = "INTE_UNIT_CODE_DUREE")
	    private String unitCodeDuree;
	    
	    @Column(name = "INTE_LOCALISATION",columnDefinition = "VARCHAR(200) ")
	    private String intervLocalisation;
	    
	    @Column(name = "INTE_SOUS_GARANTIE",columnDefinition = "DEFAULT 'N'", nullable = false)
	    private String SousGarantie;

	    @Column(name = "INTE_SOUS_CONTRAT",columnDefinition = "DEFAULT 'N'", nullable = false)
	    private String sousContrat;
 //zedthom 5atr mwjoudin fl capturet 
	   // private String demandeur;
	   // private String postDemandeur;
	    
	    
	    @Column(name = "INTE_DT_REALISATION")
	    private Date dtRealisation;

	    @Column(name = "INTE_HEURE_REALISATION",columnDefinition = "VARCHAR(5)")
	    private String heureRealisation;

	    @Column(name = "INTE_DUREE_REALISATION")
	    private Long dureeRealisation;

	    @Column(name = "INTE_COMPTE_RENDU", length = 4000)
	    private String compteRendu;
// mawjouda fl cpat ka urgence 
	    @Column(name = "INTE_PRIORITE",  columnDefinition = "VARCHAR(10)")
	    private String interventionPriorité;
// mawjoudin fl capt
	    @Column(name = "INTE_CAUSE",  columnDefinition = "VARCHAR(30)")
	    private String interventionCause;
	    
	    @Column(name = "INTE_OBSERVATION",  columnDefinition = "VARCHAR(30)")
	    private String interventionObservation;
	    
	    
	    
	    @Column(name = "INTE_MACHINE_ARRET",columnDefinition = "DEFAULT 'Non'", nullable = false)
	    private String machineArret;

	    @Column(name = "INTE_DUREE_ARRET")
	    private Long dureeArret;
	    
	    @Column(name = "INTE_HEURE_Arret",columnDefinition = "VARCHAR(5)")
	    private String heureArret;

	    
	    private double interMtHebergement;
	    private double interMtDeplacement;
	    
	    private String interDomaine;
	    
	    private Long difficulté;
	    
	    @ManyToOne
	    private Equipement equipement;

	    
	    @ManyToOne
	    private InterventionNature interventionNature;

	    @ManyToOne
	    private InterventionType interventionType;

	    @ManyToOne
	    private Client client;

	 
	    
	    
		public Client getClient() {
			return client;
		}



		public void setClient(Client client) {
			this.client = client;
		}



		public InterventionType getInterventionType() {
			return interventionType;
		}



		public void setInterventionType(InterventionType interventionType) {
			this.interventionType = interventionType;
		}



		public String getInterCode() {
			return interCode;
		}



		public void setInterCode(String interCode) {
			this.interCode = interCode;
		}



		public String getInterDesignation() {
			return interDesignation;
		}



		public void setInterDesignation(String interDesignation) {
			this.interDesignation = interDesignation;
		}



		public Long getDeclNumeroOrig() {
			return declNumeroOrig;
		}



		public void setDeclNumeroOrig(Long declNumeroOrig) {
			this.declNumeroOrig = declNumeroOrig;
		}



		public String getInterStatut() {
			return interStatut;
		}



		public void setInterStatut(String interStatut) {
			this.interStatut = interStatut;
		}



		public Date getDateCreation() {
			return dateCreation;
		}



		public void setDateCreation(Date dateCreation) {
			this.dateCreation = dateCreation;
		}



		public Date getDateCloture() {
			return dateCloture;
		}



		public void setDateCloture(Date dateCloture) {
			this.dateCloture = dateCloture;
		}



		public String getDescriptionPanne() {
			return descriptionPanne;
		}



		public void setDescriptionPanne(String descriptionPanne) {
			this.descriptionPanne = descriptionPanne;
		}



		public String getDescription() {
			return description;
		}



		public void setDescription(String description) {
			this.description = description;
		}



		public Date getDatePrevue() {
			return datePrevue;
		}



		public void setDatePrevue(Date datePrevue) {
			this.datePrevue = datePrevue;
		}



		public String getHeurePrevue() {
			return heurePrevue;
		}



		public void setHeurePrevue(String heurePrevue) {
			this.heurePrevue = heurePrevue;
		}



		public Integer getDureePrevue() {
			return dureePrevue;
		}



		public void setDureePrevue(Integer dureePrevue) {
			this.dureePrevue = dureePrevue;
		}



		public String getUnitCodeDuree() {
			return unitCodeDuree;
		}



		public void setUnitCodeDuree(String unitCodeDuree) {
			this.unitCodeDuree = unitCodeDuree;
		}



		public String getIntervLocalisation() {
			return intervLocalisation;
		}



		public void setIntervLocalisation(String intervLocalisation) {
			this.intervLocalisation = intervLocalisation;
		}



		public String getSousGarantie() {
			return SousGarantie;
		}



		public void setSousGarantie(String sousGarantie) {
			SousGarantie = sousGarantie;
		}



		public String getSousContrat() {
			return sousContrat;
		}



		public void setSousContrat(String sousContrat) {
			this.sousContrat = sousContrat;
		}



		public Date getDtRealisation() {
			return dtRealisation;
		}



		public void setDtRealisation(Date dtRealisation) {
			this.dtRealisation = dtRealisation;
		}



		public String getHeureRealisation() {
			return heureRealisation;
		}



		public void setHeureRealisation(String heureRealisation) {
			this.heureRealisation = heureRealisation;
		}



		public Long getDureeRealisation() {
			return dureeRealisation;
		}



		public void setDureeRealisation(Long dureeRealisation) {
			this.dureeRealisation = dureeRealisation;
		}



		public String getCompteRendu() {
			return compteRendu;
		}



		public void setCompteRendu(String compteRendu) {
			this.compteRendu = compteRendu;
		}



		public String getInterventionPriorité() {
			return interventionPriorité;
		}



		public void setInterventionPriorité(String interventionPriorité) {
			this.interventionPriorité = interventionPriorité;
		}



		public String getInterventionCause() {
			return interventionCause;
		}



		public void setInterventionCause(String interventionCause) {
			this.interventionCause = interventionCause;
		}



		public String getInterventionObservation() {
			return interventionObservation;
		}



		public void setInterventionObservation(String interventionObservation) {
			this.interventionObservation = interventionObservation;
		}



		public String getMachineArret() {
			return machineArret;
		}



		public void setMachineArret(String machineArret) {
			this.machineArret = machineArret;
		}



		public Long getDureeArret() {
			return dureeArret;
		}



		public void setDureeArret(Long dureeArret) {
			this.dureeArret = dureeArret;
		}



		public String getHeureArret() {
			return heureArret;
		}



		public void setHeureArret(String heureArret) {
			this.heureArret = heureArret;
		}



		public double getInterMtHebergement() {
			return interMtHebergement;
		}



		public void setInterMtHebergement(double interMtHebergement) {
			this.interMtHebergement = interMtHebergement;
		}



		public double getInterMtDeplacement() {
			return interMtDeplacement;
		}



		public void setInterMtDeplacement(double interMtDeplacement) {
			this.interMtDeplacement = interMtDeplacement;
		}



		public String getInterDomaine() {
			return interDomaine;
		}



		public void setInterDomaine(String interDomaine) {
			this.interDomaine = interDomaine;
		}



		public Long getDifficulté() {
			return difficulté;
		}



		public void setDifficulté(Long difficulté) {
			this.difficulté = difficulté;
		}



		public Equipement getEquipement() {
			return equipement;
		}



		public void setEquipement(Equipement equipement) {
			this.equipement = equipement;
		}



		public Ticket() {
			super();
			// TODO Auto-generated constructor stub
		}



		


		@Override
		public String toString() {
			return "Ticket [interCode=" + interCode + ", interDesignation=" + interDesignation + ", declNumeroOrig="
					+ declNumeroOrig + ", interStatut=" + interStatut + ", dateCreation=" + dateCreation
					+ ", dateCloture=" + dateCloture + ", descriptionPanne=" + descriptionPanne + ", description="
					+ description + ", datePrevue=" + datePrevue + ", heurePrevue=" + heurePrevue + ", dureePrevue="
					+ dureePrevue + ", unitCodeDuree=" + unitCodeDuree + ", intervLocalisation=" + intervLocalisation
					+ ", SousGarantie=" + SousGarantie + ", sousContrat=" + sousContrat + ", dtRealisation="
					+ dtRealisation + ", heureRealisation=" + heureRealisation + ", dureeRealisation="
					+ dureeRealisation + ", compteRendu=" + compteRendu + ", interventionPriorité="
					+ interventionPriorité + ", interventionCause=" + interventionCause + ", interventionObservation="
					+ interventionObservation + ", machineArret=" + machineArret + ", dureeArret=" + dureeArret
					+ ", heureArret=" + heureArret + ", interMtHebergement=" + interMtHebergement
					+ ", interMtDeplacement=" + interMtDeplacement + ", interDomaine=" + interDomaine + ", difficulté="
					+ difficulté ;
		}



		public Ticket(String interCode, String interDesignation, Long declNumeroOrig, String interStatut,
				Date dateCreation, String description, Date datePrevue, String heurePrevue, Integer dureePrevue,
				String unitCodeDuree, String intervLocalisation, String sousGarantie, String sousContrat,
				String interventionPriorité, String machineArret, Long dureeArret, String heureArret,
				Equipement equipement, Client client) {
			super();
			this.interCode = interCode;
			this.interDesignation = interDesignation;
			this.declNumeroOrig = declNumeroOrig;
			this.interStatut = interStatut;
			this.dateCreation = dateCreation;
			this.description = description;
			this.datePrevue = datePrevue;
			this.heurePrevue = heurePrevue;
			this.dureePrevue = dureePrevue;
			this.unitCodeDuree = unitCodeDuree;
			this.intervLocalisation = intervLocalisation;
			SousGarantie = sousGarantie;
			this.sousContrat = sousContrat;
			this.interventionPriorité = interventionPriorité;
			this.machineArret = machineArret;
			this.dureeArret = dureeArret;
			this.heureArret = heureArret;
			this.equipement = equipement;
			this.client=client;
		}



		public Ticket(String interCode, String interDesignation, Date dateCreation, Date datePrevue,
				String intervLocalisation, String sousGarantie, String sousContrat, String interventionPriorité,
				Equipement equipement) {
			super();
			this.interCode = interCode;
			this.interDesignation = interDesignation;
			this.dateCreation = dateCreation;
			this.datePrevue = datePrevue;
			this.intervLocalisation = intervLocalisation;
			this.SousGarantie = sousGarantie;
			this.sousContrat = sousContrat;
			this.interventionPriorité = interventionPriorité;
			this.equipement = equipement;
		}



		public InterventionNature getInterventionNature() {
			return interventionNature;
		}



		public void setInterventionNature(InterventionNature interventionNature) {
			this.interventionNature = interventionNature;
		}




	
}