package model.vo;

/**
 * Representation of a Trip object
 */
public class VOMovingViolations implements Comparable<VOMovingViolations>
{

	//Atributos de infraccion

	/**
	 * ID: elemento 1
	 */
	private int Id;

	//elemento 2 no utilizado: ROW_

	/**
	 * Location: elemento 3
	 */
	private String location; 
	/**
	 * addressID: elemento 4
	 */
	private int adressId;
	/**
	 * STREETSEGID: elemento 5
	 */
	private int streetID;
	/**
	 * Xcoord: elemento 6
	 */
	private double coordx;
	/**
	 * Ycoord: elemento 7
	 */
	private double coordy;

	//elemento 8 no utilizado: TICKETTYPE

	/**
	 * FineAMT: elemento 9
	 */
	private double fineAMT;
	/**
	 * TotalPaid: elemento 10
	 */
	private double totalpaid; 
	/**
	 * Penalty1: elemento 11
	 */
	private double penalty1; 
	/**
	 * Penalty2: elemento 12
	 */
	private double penalty2; 
	/**
	 * AccidentIndicator: elemento 13
	 */
	private String accidenIndicator; 
	/**
	 * TicketIssueDate: elemento 14
	 */
	private String ticketIssueDate;
	/**
	 * ViolationCode: elemento 15
	 */
	private String violationcode; 
	/**
	 * ViolationDesc: elemento 16
	 */	
	private String description; 
	
	

	//elemento 17 no utilizado: ROW_ID

	//Constructor
	public VOMovingViolations(int pId, String pLocation, String pTicketIssueDate, double pTotoalpaid, String pAccidentIndicator, String pDescription, String pViolationCode, double pfineAMT, int pAdressId, double pPenalty1, double pPenalty2, double pCoordx, double pCoordy, int pStreetId)
	{
		//inicializacion de atributos
		Id=pId;
		location=pLocation;
		ticketIssueDate=pTicketIssueDate;
		totalpaid=pTotoalpaid;
		accidenIndicator=pAccidentIndicator;
		description=pDescription; 		
		violationcode=pViolationCode; 
		fineAMT=pfineAMT;
		adressId=pAdressId;
		penalty1=pPenalty1;
		penalty2=pPenalty2;
		coordx = pCoordx;
		coordy = pCoordy;
		streetID=pStreetId; 

	}

	public int getStreetId() {
		return streetID; 
	}

	/**
	 * @return id - Identificador �nico de la infracci�n
	 */
	public int objectId() 
	{
		// TODO Auto-generated method stub
		return Id;
	}	


	/**
	 * @return location - Direcci�n en formato de texto.
	 */
	public String getLocation()
	{
		// TODO Auto-generated method stub
		return location; 
	}

	/**
	 * @return date - Fecha cuando se puso la infracci�n .
	 */
	public String getTicketIssueDate()
	{
		// TODO Auto-generated method stub
		return ticketIssueDate;
	}

	/**
	 * @return totalPaid - Cuanto dinero efectivamente pag� el que recibi� la infracci�n en USD.
	 */
	public double getTotalPaid() 
	{
		// TODO Auto-generated method stub
		return totalpaid;
	}

	/**
	 * @return accidentIndicator - Si hubo un accidente o no.
	 */
	public String  getAccidentIndicator() 
	{
		// TODO Auto-generated method stub
		return accidenIndicator; 
	}

	/**
	 * @return description - Descripci�n textual de la infracci�n.
	 */
	public String  getViolationDescription() 
	{
		// TODO Auto-generated method stub
		return description;
	}
	public String getViolationCode()
	{
		return violationcode;
	}

	public double getFINEAMT()
	{
		return fineAMT;
	}

	public int getAdressId()
	{
		return adressId;
	}

	public double getPenalty1()
	{
		return penalty1; 
	}

	public double getPenalty2() 
	{
		return penalty2; 
	}

	public double getX()
	{
		return coordx;
	}

	public double getY()
	{
		return coordy;
	}

	public int compareTo(VOMovingViolations otro)
	{ 
		return this.Id<otro.objectId()?-1:(this.Id>otro.objectId()?1:0); 
		}
}

