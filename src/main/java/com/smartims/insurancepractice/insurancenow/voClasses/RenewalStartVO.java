package com.smartims.insurancepractice.insurancenow.voClasses;

public class RenewalStartVO {

    String renewalPolicyNumber;
    String renewalStartTransaction;
    String renewalStartRewriteToProduct;
    String renewalStartDescription;
    String renewalStartAdditionalDeclarationText;

    public String getRenewalPolicyNumber() {
        return renewalPolicyNumber;
    }

    public void setRenewalPolicyNumber(String renewalPolicyNumber) {
        this.renewalPolicyNumber = renewalPolicyNumber;
    }
    public String getrenewalStartTransaction() {
        return renewalStartTransaction;
    }

    public void setrenewalStartTransaction(String renewalStartTransaction) {
        this.renewalStartTransaction = renewalStartTransaction;
    }

    public String getRenewalStartRewriteToProduct() {
        return renewalStartRewriteToProduct;
    }

    public void setRenewalStartRewriteToProduct(String renewalStartRewriteToProduct) {
        this.renewalStartRewriteToProduct = renewalStartRewriteToProduct;
    }

    public String getRenewalStartDescription() {
        return renewalStartDescription;
    }

    public void setRenewalStartDescription(String renewalStartDescription) {
        this.renewalStartDescription = renewalStartDescription;
    }

    public String getRenewalStartAdditionalDeclarationText() {
        return renewalStartAdditionalDeclarationText;
    }

    public void setRenewalStartAdditionalDeclarationText(String renewalStartAdditionalDeclarationText) {
        this.renewalStartAdditionalDeclarationText = renewalStartAdditionalDeclarationText;
    }
}
