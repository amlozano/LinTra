package javaMM;

import java.io.Serializable;

public class LabeledStatement extends NamedElement implements Serializable {

	private static final long serialVersionUID = 1L;

	String id;

	String bodyID;
	Boolean bodyIsComposed = true;

	String[] usagesInBreakStatementsID;
	Boolean usagesInBreakStatementsIsComposed = false;

	String[] usagesInContinueStatementsID;
	Boolean usagesInContinueStatementsIsComposed = false;

	public LabeledStatement() {
	}

	public LabeledStatement(String id, String[] commentsID,
			String originalCompilationUnitID, String originalClassFileID,
			String name, Boolean proxy, String[] usagesInImportsID,
			String bodyID, String[] usagesInBreakStatementsID,
			String[] usagesInContinueStatementsID) {
		super(commentsID, originalCompilationUnitID, originalClassFileID, name,
				proxy, usagesInImportsID);

		this.id = id;

		this.bodyID = bodyID;
		this.usagesInBreakStatementsID = usagesInBreakStatementsID;
		this.usagesInContinueStatementsID = usagesInContinueStatementsID;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setBody(String bodyID) {
		this.bodyID = bodyID;
	}

	public String getBody() {
		return bodyID;
	}

	public void setUsagesInBreakStatements(String[] usagesInBreakStatementsID) {
		this.usagesInBreakStatementsID = usagesInBreakStatementsID;
	}

	public String[] getUsagesInBreakStatements() {
		return usagesInBreakStatementsID;
	}

	public void setUsagesInContinueStatements(
			String[] usagesInContinueStatementsID) {
		this.usagesInContinueStatementsID = usagesInContinueStatementsID;
	}

	public String[] getUsagesInContinueStatements() {
		return usagesInContinueStatementsID;
	}

}