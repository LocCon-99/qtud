package qtud.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

public class ResourceBundleUtils {

    private static final String SPLIT_CHARACTER = ";";
    /*   24 */ private static ResourceBundle rb = null;

    public static String getOriginalPrice() {
        /*   40 */ rb = ResourceBundle.getBundle("config");
        /*   41 */ return rb.getString("originalPrice");
    }

    public static String getValueByKey(String key) {
        /*   45 */ rb = ResourceBundle.getBundle("config");
        /*   46 */ return rb.getString(key);
    }

    public static List getProcFormsSendNotice() {
        /*   50 */ rb = ResourceBundle.getBundle("config");
        /*   51 */ return Arrays.asList(rb.getString("procurement.forms.sendNotice").split(";"));
    }

    public static List getProcFormsNoticeMedia() {
        /*   55 */ rb = ResourceBundle.getBundle("config");
        /*   56 */ return Arrays.asList(rb.getString("procurement.forms.noticeMedia").split(";"));
    }

    public static String getProcPackageStatusLabel(Long statusCode) {
        /*   60 */ rb = ResourceBundle.getBundle("com.lifetek.qldtktts.struts.ApplicationResource");
        /*   61 */ return rb.getString("label.procurement.status" + statusCode.toString());
    }

    public static String getAttachmentTypeLabel(Long type) {
        /*   65 */ rb = ResourceBundle.getBundle("config");
        /*   66 */ return rb.getString("attachment.label." + type.toString());
    }

    public static String getAStartWorkttachmentTypeLabe(Long type) {
        /*   70 */ rb = ResourceBundle.getBundle("config");
        /*   71 */ return rb.getString("attachment.type.startWork." + type.toString());
    }

    public static String getApplicationResource(String key) {
        /*   75 */ rb = ResourceBundle.getBundle("com.lifetek.ltaccounts.struts.ApplicationResource");
        /*   76 */ return rb.getString(key);
    }

    public static String getConfigureResource(String key) {
        /*   80 */ rb = ResourceBundle.getBundle("config");
        /*   81 */ return rb.getString(key);
    }

    public static String getPathToFolderUpload() {
        /*   85 */ rb = ResourceBundle.getBundle("config");
        /*   86 */ return rb.getString("folder_upload");
    }

    public static String getPathToUpload() {
        /*   90 */ rb = ResourceBundle.getBundle("config");
        /*   91 */ return rb.getString("path_to_upload");
    }

    public static List getProcPackageListAttachmentType() {
        /*   95 */ rb = ResourceBundle.getBundle("config");
        /*   96 */ List temp = Arrays.asList(rb.getString("attachment.type.procPackage.list").split(";"));

        /*   98 */ List result = new ArrayList();
        /*   99 */ for (int i = 0; i < temp.size(); i++) {
            /*  100 */ result.add(Long.valueOf(temp.get(i).toString()));
        }
        /*  102 */ return result;
    }

    public static List getProjInvestProposalListAttachmentType() {
        /*  106 */ rb = ResourceBundle.getBundle("config");
        /*  107 */ List temp = Arrays.asList(rb.getString("attachment.type.projInvestProposal.list").split(";"));

        /*  109 */ List result = new ArrayList();
        /*  110 */ for (int i = 0; i < temp.size(); i++) {
            /*  111 */ result.add(Long.valueOf(temp.get(i).toString()));
        }
        /*  113 */ return result;
    }

    public static List getProjInvestProjectListAttachmentType() {
        /*  117 */ rb = ResourceBundle.getBundle("config");
        /*  118 */ List temp = Arrays.asList(rb.getString("attachment.type.projInvestProject.list").split(";"));

        /*  120 */ List result = new ArrayList();
        /*  121 */ for (int i = 0; i < temp.size(); i++) {
            /*  122 */ result.add(Long.valueOf(temp.get(i).toString()));
        }
        /*  124 */ return result;
    }

    public static List getProjInvestProposalAutoCreateTypeList() {
        /*  128 */ rb = ResourceBundle.getBundle("config");
        /*  129 */ List temp = Arrays.asList(rb.getString("project.investProposal.type.autoCreateProjList").split(";"));

        /*  131 */ List result = new ArrayList();
        /*  132 */ for (int i = 0; i < temp.size(); i++) {
            /*  133 */ result.add(Long.valueOf(temp.get(i).toString()));
        }
        /*  135 */ return result;
    }

    public static List getProjInvestComponentListAttachmentType() {
        /*  139 */ rb = ResourceBundle.getBundle("config");
        /*  140 */ List temp = Arrays.asList(rb.getString("attachment.type.projInvestComponent.list").split(";"));

        /*  142 */ List result = new ArrayList();
        /*  143 */ for (int i = 0; i < temp.size(); i++) {
            /*  144 */ result.add(Long.valueOf(temp.get(i).toString()));
        }
        /*  146 */ return result;
    }

    public static Long getInvestComponentAttachmentType() {
        /*  150 */ rb = ResourceBundle.getBundle("config");
        /*  151 */ return Long.valueOf(rb.getString("attachment.type.investComponent"));
    }

    public static Long getAppraiseInvestComponentAttachmentType() {
        /*  155 */ rb = ResourceBundle.getBundle("config");
        /*  156 */ return Long.valueOf(rb.getString("attachment.type.investComponent.appraise"));
    }

    public static Long getCloseInvestComponentAttachmentType() {
        /*  160 */ rb = ResourceBundle.getBundle("config");
        /*  161 */ return Long.valueOf(rb.getString("attachment.type.investComponent.close"));
    }

    public static Long getApproveInvestComponentAttachmentType() {
        /*  165 */ rb = ResourceBundle.getBundle("config");
        /*  166 */ return Long.valueOf(rb.getString("attachment.type.investComponent.approve"));
    }

    public static List getProcBidderListAttachmentType() {
        /*  170 */ rb = ResourceBundle.getBundle("config");
        /*  171 */ List temp = Arrays.asList(rb.getString("attachment.type.procBidder.list").split(";"));

        /*  173 */ List result = new ArrayList();
        /*  174 */ for (int i = 0; i < temp.size(); i++) {
            /*  175 */ result.add(Long.valueOf(temp.get(i).toString()));
        }
        /*  177 */ return result;
    }

    public static Long getProcPackageCreatePlanAttachmentType() {
        /*  181 */ rb = ResourceBundle.getBundle("config");
        /*  182 */ return Long.valueOf(rb.getString("attachment.type.procPackage.createPlan"));
    }

    public static Long getProcPackageUpdateStatusAttachmentType() {
        /*  186 */ rb = ResourceBundle.getBundle("config");
        /*  187 */ return Long.valueOf(rb.getString("attachment.type.procPackage.updateStatus"));
    }

    public static Long getProcPackageCreateComponentAttachmentType() {
        /*  191 */ rb = ResourceBundle.getBundle("config");
        /*  192 */ return Long.valueOf(rb.getString("attachment.type.procPackage.createComponent"));
    }

    public static Long getProcPackageCreateBidderAttachmentType() {
        /*  196 */ rb = ResourceBundle.getBundle("config");
        /*  197 */ return Long.valueOf(rb.getString("attachment.type.procPackage.createBidder"));
    }

    public static Long getProcPackageReportResultAttachmentType() {
        /*  201 */ rb = ResourceBundle.getBundle("config");
        /*  202 */ return Long.valueOf(rb.getString("attachment.type.procPackage.reportResult"));
    }

    public static Long getProcPackageAppraisePlanAttachmentType() {
        /*  206 */ rb = ResourceBundle.getBundle("config");
        /*  207 */ return Long.valueOf(rb.getString("attachment.type.procPackage.appraisePlan"));
    }

    public static Long getProcPackageApprovePlanAttachmentType() {
        /*  211 */ rb = ResourceBundle.getBundle("config");
        /*  212 */ return Long.valueOf(rb.getString("attachment.type.procPackage.approvePlan"));
    }

    public static Long getProcPackageApproveExpertCellAttachmentType() {
        /*  216 */ rb = ResourceBundle.getBundle("config");
        /*  217 */ return Long.valueOf(rb.getString("attachment.type.procPackage.approveExpertCell"));
    }

    public static Long getProcPackageProposalBiddingDocumentsAttachmentType() {
        /*  221 */ rb = ResourceBundle.getBundle("config");
        /*  222 */ return Long.valueOf(rb.getString("attachment.type.procPackage.proposalBiddingDocuments"));
    }

    public static Long getProcPackageInvitationAttachmentType() {
        /*  226 */ rb = ResourceBundle.getBundle("config");
        /*  227 */ return Long.valueOf(rb.getString("attachment.type.procPackage.invitation"));
    }

    public static Long getProcPackageIssueBiddingDocumentsAttachmentType() {
        /*  231 */ rb = ResourceBundle.getBundle("config");
        /*  232 */ return Long.valueOf(rb.getString("attachment.type.procPackage.bidder.issueBiddingDocuments"));
    }

    public static Long getProcPackageReceiveBidsAttachmentType() {
        /*  236 */ rb = ResourceBundle.getBundle("config");
        /*  237 */ return Long.valueOf(rb.getString("attachment.type.procPackage.bidder.receiveBids"));
    }

    public static Long getProcPackageBidOpeningAttachmentType() {
        /*  241 */ rb = ResourceBundle.getBundle("config");
        /*  242 */ return Long.valueOf(rb.getString("attachment.type.procPackage.bidOpening"));
    }

    public static Long getProcPackageBidderBidOpeningAttachmentType() {
        /*  246 */ rb = ResourceBundle.getBundle("config");
        /*  247 */ return Long.valueOf(rb.getString("attachment.type.procPackage.bidder.bidOpening"));
    }

    public static Long getProcPackageAppraiseBiddingDocumentsAttachmentType() {
        /*  251 */ rb = ResourceBundle.getBundle("config");
        /*  252 */ return Long.valueOf(rb.getString("attachment.type.procPackage.appraiseBiddingDocuments"));
    }

    public static Long getProcPackageApproveBiddingDocumentsAttachmentType() {
        /*  256 */ rb = ResourceBundle.getBundle("config");
        /*  257 */ return Long.valueOf(rb.getString("attachment.type.procPackage.approveBiddingDocuments"));
    }

    public static Long getCreateBidEvaluationReportAttachedDocumentType() {
        /*  261 */ rb = ResourceBundle.getBundle("config");
        /*  262 */ return Long.valueOf(rb.getString("attachment.type.procPackage.createBidEval"));
    }

    public static Long getAppraiseBidEvaluationReportAttachedDocumentType() {
        /*  271 */ rb = ResourceBundle.getBundle("config");
        /*  272 */ return Long.valueOf(rb.getString("attachment.type.procPackage.appraiseBidEval"));
    }

    public static Long getApproveBidEvaluationReportAttachedDocumentType() {
        /*  281 */ rb = ResourceBundle.getBundle("config");
        /*  282 */ return Long.valueOf(rb.getString("attachment.type.procPackage.approveBidEval"));
    }

    public static Long getInsertWorkItemAttachedDocumentType() {
        /*  286 */ rb = ResourceBundle.getBundle("config");
        /*  287 */ return Long.valueOf(rb.getString("attachment.type.constrConstruction.insertWorkItem"));
    }

    public static Long getApproveConstructionAttachedDocumentType() {
        /*  291 */ rb = ResourceBundle.getBundle("config");
        /*  292 */ return Long.valueOf(rb.getString("attachment.type.constrConstruction.approveConstruction"));
    }

    public static Long getStartConstructionAttachedDocumentType() {
        /*  296 */ rb = ResourceBundle.getBundle("config");
        /*  297 */ return Long.valueOf(rb.getString("attachment.type.constrConstruction.startConstruction"));
    }

    public static Long getAcceptConstructionAttachedDocumentType() {
        /*  301 */ rb = ResourceBundle.getBundle("config");
        /*  302 */ return Long.valueOf(rb.getString("attachment.type.constrConstruction.acceptConstruction"));
    }

    public static String getImportRequestCodePrefix() {
        /*  306 */ rb = ResourceBundle.getBundle("config");
        /*  307 */ return rb.getString("immportRequest.code.prefix");
    }

    public static String getCheckRequestCodePrefix() {
        /*  311 */ rb = ResourceBundle.getBundle("config");
        /*  312 */ return rb.getString("checkRequest.code.prefix");
    }

    public static String getImportCommandCodePrefix() {
        /*  316 */ rb = ResourceBundle.getBundle("config");
        /*  317 */ return rb.getString("immportCommand.code.prefix");
    }

    public static String getCheckNoteCodePrefix() {
        /*  321 */ rb = ResourceBundle.getBundle("config");
        /*  322 */ return rb.getString("checkNote.code.prefix");
    }

    public static String getDeliveryNoteCodePrefix() {
        /*  326 */ rb = ResourceBundle.getBundle("config");
        /*  327 */ return rb.getString("delivery.code.prefix");
    }

    public static String getExportRequestCodePrefix() {
        /*  331 */ rb = ResourceBundle.getBundle("config");
        /*  332 */ return rb.getString("exportRequest.code.prefix");
    }

    public static String getReceiptNoteCodePrefix() {
        /*  336 */ rb = ResourceBundle.getBundle("config");
        /*  337 */ return rb.getString("receiptNote.code.prefix");
    }

    public static String getUpgradeReqCodePrefix() {
        /*  341 */ rb = ResourceBundle.getBundle("config");
        /*  342 */ return rb.getString("upgradeReq.code.prefix");
    }

    public static String getMoveCommandCodePrefix() {
        /*  346 */ rb = ResourceBundle.getBundle("config");
        /*  347 */ return rb.getString("moveCommand.code.prefix");
    }

    public static long getWarehouseRootId() {
        /*  351 */ rb = ResourceBundle.getBundle("config");
        /*  352 */ return Long.parseLong(rb.getString("warehouse.root.id"));
    }

    public static long getMerchandiseRootId() {
        /*  356 */ rb = ResourceBundle.getBundle("config");
        /*  357 */ return Long.parseLong(rb.getString("merchandise.root.id"));
    }

    public static long getParentRootId() {
        /*  361 */ rb = ResourceBundle.getBundle("config");
        /*  362 */ return Long.parseLong(rb.getString("parent.root.id"));
    }

    public static long getGroupRootId() {
        /*  366 */ rb = ResourceBundle.getBundle("config");
        /*  367 */ return Long.parseLong(rb.getString("group.root.id"));
    }

    public static long getWarehousePosRootId() {
        /*  371 */ rb = ResourceBundle.getBundle("config");
        /*  372 */ return Long.parseLong(rb.getString("warehousePos.root.id"));
    }

    public static String getExportCommandCodePrefix() {
        /*  376 */ rb = ResourceBundle.getBundle("config");
        /*  377 */ return rb.getString("exportCommand.code.prefix");
    }

    public static String getInvestProjectCodePrefix() {
        /*  381 */ rb = ResourceBundle.getBundle("config");
        /*  382 */ return rb.getString("invProjectCode.code.prefix");
    }

    public static String getEconomicReportCodePrefix() {
        /*  386 */ rb = ResourceBundle.getBundle("config");
        /*  387 */ return rb.getString("economicReport.code.prefix");
    }

    public static long getMaxLengthOfAutoNumber() {
        /*  391 */ rb = ResourceBundle.getBundle("config");
        /*  392 */ return Long.parseLong(rb.getString("autoNumber.maxlength"));
    }

    public static long getAutoNumberTypeOfImpReq() {
        /*  396 */ rb = ResourceBundle.getBundle("config");
        /*  397 */ return Long.parseLong(rb.getString("autoNumber.type.impReq"));
    }

    public static long getAutoNumberTypeOfImpCmd() {
        /*  401 */ rb = ResourceBundle.getBundle("config");
        /*  402 */ return Long.parseLong(rb.getString("autoNumber.type.impCmd"));
    }

    public static long getAutoNumberTypeOfRetrieveReq() {
        /*  406 */ rb = ResourceBundle.getBundle("config");
        /*  407 */ return Long.parseLong(rb.getString("autoNumber.type.retrieveReq"));
    }

    public static long getAutoNumberTypeOfMoveReq() {
        /*  411 */ rb = ResourceBundle.getBundle("config");
        /*  412 */ return Long.parseLong(rb.getString("autoNumber.type.moveReq"));
    }

    public static long getAutoNumberTypeOfProcessRetrieveReq() {
        /*  416 */ rb = ResourceBundle.getBundle("config");
        /*  417 */ return Long.parseLong(rb.getString("autoNumber.type.processRetrieveReq"));
    }

    public static long getAutoNumberTypeOfCheckNote() {
        /*  421 */ rb = ResourceBundle.getBundle("config");
        /*  422 */ return Long.parseLong(rb.getString("autoNumber.type.checkNote"));
    }

    public static long getAutoNumberTypeOfImpNote() {
        /*  426 */ rb = ResourceBundle.getBundle("config");
        /*  427 */ return Long.parseLong(rb.getString("autoNumber.type.impNote"));
    }

    public static long getAutoNumberTypeOfExpReq() {
        /*  431 */ rb = ResourceBundle.getBundle("config");
        /*  432 */ return Long.parseLong(rb.getString("autoNumber.type.expReq"));
    }

    public static long getAutoNumberTypeOfExpCmd() {
        /*  436 */ rb = ResourceBundle.getBundle("config");
        /*  437 */ return Long.parseLong(rb.getString("autoNumber.type.expCmd"));
    }

    public static long getAutoNumberTypeOfInvProject() {
        /*  441 */ rb = ResourceBundle.getBundle("config");
        /*  442 */ return Long.parseLong(rb.getString("autoNumber.type.invProjectCode"));
    }

    public static long getAutoNumberTypeOfEcoReport() {
        /*  446 */ rb = ResourceBundle.getBundle("config");
        /*  447 */ return Long.parseLong(rb.getString("autoNumber.type.economicReport"));
    }

    public static long getAutoNumberTypeOfExpNote() {
        /*  451 */ rb = ResourceBundle.getBundle("config");
        /*  452 */ return Long.parseLong(rb.getString("autoNumber.type.expNote"));
    }

    public static long getAutoNumberTypeOfCheckReq() {
        /*  456 */ rb = ResourceBundle.getBundle("config");
        /*  457 */ return Long.parseLong(rb.getString("autoNumber.type.chkReq"));
    }

    public static long getAutoNumberTypeOfUpgradeReq() {
        /*  461 */ rb = ResourceBundle.getBundle("config");
        /*  462 */ return Long.parseLong(rb.getString("autoNumber.type.upgradeReq"));
    }

    public static long getAutoNumberTypeOfUpgradeCommand() {
        /*  466 */ rb = ResourceBundle.getBundle("config");
        /*  467 */ return Long.parseLong(rb.getString("autoNumber.type.upgradeCommand"));
    }

    public static long getAutoNumberTypeOfMoveCommand() {
        /*  471 */ rb = ResourceBundle.getBundle("config");
        /*  472 */ return Long.parseLong(rb.getString("autoNumber.type.moveCommand"));
    }

    public static Long getMerHandOverAttachmentType() {
        /*  476 */ rb = ResourceBundle.getBundle("config");
        /*  477 */ return Long.valueOf(rb.getString("attachment.type.merEntity.handover"));
    }

    public static long getMerEntityStatusNotUse() {
        /*  481 */ rb = ResourceBundle.getBundle("config");
        /*  482 */ return Long.parseLong(rb.getString("merchandise.status.notUse"));
    }

    public static long getMerEntityStatusUse() {
        /*  486 */ rb = ResourceBundle.getBundle("config");
        /*  487 */ return Long.parseLong(rb.getString("merchandise.status.Use"));
    }

    public static long getMerEntityStatusWaitingWarranty() {
        /*  491 */ rb = ResourceBundle.getBundle("config");
        /*  492 */ return Long.parseLong(rb.getString("merchandise.status.waitingWarranty"));
    }

    public static long getMerEntityStatusWaitingRepair() {
        /*  496 */ rb = ResourceBundle.getBundle("config");
        /*  497 */ return Long.parseLong(rb.getString("merchandise.status.waitingRepair"));
    }

    public static long getMerEntityStatusWaitingLiquidate() {
        /*  501 */ rb = ResourceBundle.getBundle("config");
        /*  502 */ return Long.parseLong(rb.getString("merchandise.status.waitingLiquidate"));
    }

    public static long getMerEntityStatusWaitingImpToWarranty() {
        /*  506 */ rb = ResourceBundle.getBundle("config");
        /*  507 */ return Long.parseLong(rb.getString("merchandise.status.waittingImpToWarranty"));
    }

    public static long getMerEntityStatusWaitingImpToRepair() {
        /*  511 */ rb = ResourceBundle.getBundle("config");
        /*  512 */ return Long.parseLong(rb.getString("merchandise.status.waittingImpToRepair"));
    }

    public static long getMerEntityStatusWaitingImpToLiquidate() {
        /*  516 */ rb = ResourceBundle.getBundle("config");
        /*  517 */ return Long.parseLong(rb.getString("merchandise.status.waittingImpToLiquidate"));
    }

    public static long getMerEntityStatusRepaired() {
        /*  521 */ rb = ResourceBundle.getBundle("config");
        /*  522 */ return Long.parseLong(rb.getString("merchandise.status.repaired"));
    }

    public static String getAssetManageReqCodePrefix() {
        /*  526 */ rb = ResourceBundle.getBundle("config");
        /*  527 */ return rb.getString("assetManageReq.code.prefix");
    }

    public static String getAssetMoveReqCodePrefix() {
        /*  531 */ rb = ResourceBundle.getBundle("config");
        /*  532 */ return rb.getString("assetMoveReq.code.prefix");
    }

    public static String getProcessAssetManageReqCodePrefix() {
        /*  536 */ rb = ResourceBundle.getBundle("config");
        /*  537 */ return rb.getString("processAssetManageReq.code.prefix");
    }

    public static String getAssetRepairReqCodePrefix() {
        /*  541 */ rb = ResourceBundle.getBundle("config");
        /*  542 */ return rb.getString("assetRepairReq.code.prefix");
    }

    public static String getWithdrawInternalCodePrefix() {
        /*  546 */ rb = ResourceBundle.getBundle("config");
        /*  547 */ return rb.getString("withdrawInternal.code.prefix");
    }

    public static String getIncreaseFixedAssetsCodePrefix() {
        /*  551 */ rb = ResourceBundle.getBundle("config");
        /*  552 */ return rb.getString("increaseFixedAssets.code.prefix");
    }

    public static String getAssetsMaintainCodePrefix() {
        /*  556 */ rb = ResourceBundle.getBundle("config");
        /*  557 */ return rb.getString("assetsMaintain.code.prefix");
    }

    public static String getUpgradeCommandPrefix() {
        /*  561 */ rb = ResourceBundle.getBundle("config");
        /*  562 */ return rb.getString("upgradeCommand.code.prefix");
    }

    public static Long getAssetManageReqAttachmentType() {
        /*  566 */ rb = ResourceBundle.getBundle("config");
        /*  567 */ return Long.valueOf(rb.getString("attachment.type.AssetmanageReq"));
    }

    public static Long getIncreaseFixedAssetsAttachmentType() {
        /*  571 */ rb = ResourceBundle.getBundle("config");
        /*  572 */ return Long.valueOf(rb.getString("attachment.type.IncreaseFixedAssets"));
    }

    public static Long getWareQualityCheckNoteAttachmentType() {
        /*  576 */ rb = ResourceBundle.getBundle("config");
        /*  577 */ return Long.valueOf(rb.getString("attachment.type.WareQualityCheckNote"));
    }

    public static Long getAssetsMaintainAttachmentType() {
        /*  581 */ rb = ResourceBundle.getBundle("config");
        /*  582 */ return Long.valueOf(rb.getString("attachment.type.AssetsMaintain"));
    }

    public static Long getAssetMoveReqAttachmentType() {
        /*  586 */ rb = ResourceBundle.getBundle("config");
        /*  587 */ return Long.valueOf(rb.getString("attachment.type.AssetMoveReq"));
    }

    public static Long getApproveAssetMoveReqAttachmentType() {
        /*  591 */ rb = ResourceBundle.getBundle("config");
        /*  592 */ return Long.valueOf(rb.getString("attachment.type.ApproveAssetMoveReq"));
    }

    public static Long getWareDeliveryNoteAttachmentType() {
        /*  596 */ rb = ResourceBundle.getBundle("config");
        /*  597 */ return Long.valueOf(rb.getString("attachment.type.WareDeliveryNote"));
    }

    public static Long getWareConfirmDelvrGroupAttachmentType() {
        /*  601 */ rb = ResourceBundle.getBundle("config");
        /*  602 */ return Long.valueOf(rb.getString("attachment.type.WareConfirmDelvrGroup"));
    }

    public static Long getProcessAssetManageReqAttachmentType() {
        /*  606 */ rb = ResourceBundle.getBundle("config");
        /*  607 */ return Long.valueOf(rb.getString("attachment.type.ProcessAssetmanageReq"));
    }

    public static Long getApproveAssetManageReqAttachmentType() {
        /*  611 */ rb = ResourceBundle.getBundle("config");
        /*  612 */ return Long.valueOf(rb.getString("attachment.type.ApproveAssetmanageReq"));
    }

    public static Long getRoleAdmin() {
        /*  616 */ rb = ResourceBundle.getBundle("config");
        /*  617 */ return Long.valueOf(rb.getString("role.admin.id"));
    }

    public static Long getRolePhongKeHoach() {
        /*  621 */ rb = ResourceBundle.getBundle("config");
        /*  622 */ return Long.valueOf(rb.getString("role.PKH.id"));
    }

    public static List getRoleMaintainList() {
        /*  626 */ rb = ResourceBundle.getBundle("config");
        /*  627 */ String[] temp = rb.getString("role.Maintain.ListId").split(";");
        /*  628 */ List result = new ArrayList();
        /*  629 */ for (int i = 0; i < temp.length; i++) {
            /*  630 */ result.add(Long.valueOf(temp[i]));
        }
        /*  632 */ return result;
    }

    public static Long getRolePhongKyThuat() {
        /*  636 */ rb = ResourceBundle.getBundle("config");
        /*  637 */ return Long.valueOf(rb.getString("role.PKT.id"));
    }

    public static Long getRolePhongDauTu() {
        /*  641 */ rb = ResourceBundle.getBundle("config");
        /*  642 */ return Long.valueOf(rb.getString("role.PDT.id"));
    }

    public static Long getRolePhongQLKhoTinh() {
        /*  646 */ rb = ResourceBundle.getBundle("config");
        /*  647 */ return Long.valueOf(rb.getString("role.QLKhoTinh.id"));
    }

    public static Long getRolePhongTaiChinh() {
        /*  651 */ rb = ResourceBundle.getBundle("config");
        /*  652 */ return Long.valueOf(rb.getString("role.PTC.id"));
    }

    public static Long getContractNegotiateAttachmentType() {
        /*  656 */ rb = ResourceBundle.getBundle("config");
        /*  657 */ return Long.valueOf(rb.getString("attachment.type.ContractNegotiate"));
    }

    public static Long getContractSignAttachmentType() {
        /*  661 */ rb = ResourceBundle.getBundle("config");
        /*  662 */ return Long.valueOf(rb.getString("attachment.type.ContractSign"));
    }

    public static Long getUpgradeReqAttachmentType() {
        /*  666 */ rb = ResourceBundle.getBundle("config");
        /*  667 */ return Long.valueOf(rb.getString("attachment.type.upgradeReq"));
    }

    public static Long getResetPriceAttachmentType() {
        /*  671 */ rb = ResourceBundle.getBundle("config");
        /*  672 */ return Long.valueOf(rb.getString("attachment.type.resetPrice"));
    }

    public static long getAutoNumberTypeOfRepairReq() {
        /*  676 */ rb = ResourceBundle.getBundle("config");
        /*  677 */ return Long.parseLong(rb.getString("autoNumber.type.repairReq"));
    }

    public static long getMerEntityStatusFail() {
        /*  687 */ rb = ResourceBundle.getBundle("config");
        /*  688 */ return Long.parseLong(rb.getString("merchandise.status.fail"));
    }

    public static long getMerEntityStatusProgressRepair() {
        /*  692 */ rb = ResourceBundle.getBundle("config");
        /*  693 */ return Long.parseLong(rb.getString("merchandise.status.progressRepair"));
    }

    public static long getMerEntityStatusProgressWarranty() {
        /*  697 */ rb = ResourceBundle.getBundle("config");
        /*  698 */ return Long.parseLong(rb.getString("merchandise.status.progressWarranty"));
    }

    public static long getMerEntityStatusLiquidated() {
        /*  702 */ rb = ResourceBundle.getBundle("config");
        /*  703 */ return Long.parseLong(rb.getString("merchandise.status.liquidated"));
    }

    public static Long getContractChangeAttachmentType() {
        /*  707 */ rb = ResourceBundle.getBundle("config");
        /*  708 */ return Long.valueOf(rb.getString("attachment.type.ContractChange"));
    }

    public static Long getContractPaymentAttachmentType() {
        /*  712 */ rb = ResourceBundle.getBundle("config");
        /*  713 */ return Long.valueOf(rb.getString("attachment.type.ContractPayment"));
    }

    public static Long getContractLiquidationAttachmentType() {
        /*  717 */ rb = ResourceBundle.getBundle("config");
        /*  718 */ return Long.valueOf(rb.getString("attachment.type.ContractLiquidation"));
    }

    public static List getContractListAttachmentType() {
        /*  722 */ rb = ResourceBundle.getBundle("config");
        /*  723 */ String[] temp = rb.getString("attachment.type.contract.list").split(";");
        /*  724 */ List result = new ArrayList();
        /*  725 */ for (int i = 0; i < temp.length; i++) {
            /*  726 */ result.add(Long.valueOf(temp[i]));
        }
        /*  728 */ return result;
    }

    public static List getListByKey(String key) {
        /*  732 */ rb = ResourceBundle.getBundle("config");
        /*  733 */ String[] temp = rb.getString(key).split(";");
        /*  734 */ List result = new ArrayList();
        /*  735 */ for (int i = 0; i < temp.length; i++) {
            /*  736 */ result.add(Long.valueOf(temp[i]));
        }
        /*  738 */ return result;
    }

    public static List getContractUpdateListAttachmentType() {
        /*  742 */ rb = ResourceBundle.getBundle("config");
        /*  743 */ String[] temp = rb.getString("attachment.type.contract.update.list").split(";");
        /*  744 */ List result = new ArrayList();
        /*  745 */ for (int i = 0; i < temp.length; i++) {
            /*  746 */ result.add(Long.valueOf(temp[i]));
        }
        /*  748 */ return result;
    }

    public static Long getContractUpdateStatusAttachmentType() {
        /*  752 */ rb = ResourceBundle.getBundle("config");
        /*  753 */ return Long.valueOf(rb.getString("attachment.type.ContractUpdateStatus"));
    }

    public static Long getContractUpdatePhaseAttachmentType() {
        /*  757 */ rb = ResourceBundle.getBundle("config");
        /*  758 */ return Long.valueOf(rb.getString("attachment.type.ContractUpdatePhase"));
    }

    public static Long getHandleRepairReqAttachmentType() {
        /*  762 */ rb = ResourceBundle.getBundle("config");
        /*  763 */ return Long.valueOf(rb.getString("attachment.type.handleRepairReq"));
    }

    public static Long getHandleUpgradeReqAttachmentType() {
        /*  767 */ rb = ResourceBundle.getBundle("config");
        /*  768 */ return Long.valueOf(rb.getString("attachment.type.handleUpgradeReq"));
    }

    public static long getAutoNumberTypeOfRepairNote() {
        /*  772 */ rb = ResourceBundle.getBundle("config");
        /*  773 */ return Long.parseLong(rb.getString("autoNumber.type.repairNote"));
    }

    public static long getAutoNumberTypeOfWarrantyNote() {
        /*  777 */ rb = ResourceBundle.getBundle("config");
        /*  778 */ return Long.parseLong(rb.getString("autoNumber.type.warrantyNote"));
    }

    public static long getAutoNumberTypeOfLiquidateNote() {
        /*  782 */ rb = ResourceBundle.getBundle("config");
        /*  783 */ return Long.parseLong(rb.getString("autoNumber.type.liquidateNote"));
    }

    public static String getRepairNotePrefix() {
        /*  787 */ rb = ResourceBundle.getBundle("config");
        /*  788 */ return rb.getString("assetRepairNote.code.prefix");
    }

    public static String getWarrantyNotePrefix() {
        /*  792 */ rb = ResourceBundle.getBundle("config");
        /*  793 */ return rb.getString("assetWarrantyNote.code.prefix");
    }

    public static String getLiauidateNotePrefix() {
        /*  797 */ rb = ResourceBundle.getBundle("config");
        /*  798 */ return rb.getString("assetLiquidateNote.code.prefix");
    }

    public static Long getRepairProcessAttachmentType() {
        /*  802 */ rb = ResourceBundle.getBundle("config");
        /*  803 */ return Long.valueOf(rb.getString("attachment.type.repairProcess"));
    }

    public static Long getLiquidateProcessAttachmentType() {
        /*  807 */ rb = ResourceBundle.getBundle("config");
        /*  808 */ return Long.valueOf(rb.getString("attachment.type.liquidateProcess"));
    }

    public static Long getInvestProjectAttachmentType() {
        /*  813 */ rb = ResourceBundle.getBundle("config");
        /*  814 */ return Long.valueOf(rb.getString("attachment.type.investProject"));
    }

    public static Long getAppraiseInvestProjectAttachmentType() {
        /*  818 */ rb = ResourceBundle.getBundle("config");
        /*  819 */ return Long.valueOf(rb.getString("attachment.type.investProject.appraise"));
    }

    public static Long getCloseInvestProjectAttachmentType() {
        /*  823 */ rb = ResourceBundle.getBundle("config");
        /*  824 */ return Long.valueOf(rb.getString("attachment.type.investProject.close"));
    }

    public static Long getApproveInvestProjectAttachmentType() {
        /*  828 */ rb = ResourceBundle.getBundle("config");
        /*  829 */ return Long.valueOf(rb.getString("attachment.type.investProject.approve"));
    }

    public static Long getInvestProposalAttachmentType() {
        /*  835 */ rb = ResourceBundle.getBundle("config");
        /*  836 */ return Long.valueOf(rb.getString("attachment.type.investProposal"));
    }

    public static Long getAppraiseInvestProposalAttachmentType() {
        /*  840 */ rb = ResourceBundle.getBundle("config");
        /*  841 */ return Long.valueOf(rb.getString("attachment.type.investProposal.appraise"));
    }

    public static Long getApproveInvestProposalAttachmentType() {
        /*  845 */ rb = ResourceBundle.getBundle("config");
        /*  846 */ return Long.valueOf(rb.getString("attachment.type.investProposal.approve"));
    }

    public static Long getBalanceFileAttachmentType() {
        /*  851 */ rb = ResourceBundle.getBundle("config");
        /*  852 */ return Long.valueOf(rb.getString("attachment.type.balanceFile"));
    }

    public static Long getStartWorkFileAttachmentType() {
        /*  856 */ rb = ResourceBundle.getBundle("config");
        /*  857 */ return Long.valueOf(rb.getString("attachment.type.startWork"));
    }

    public static Long getHistoryFileAttachmentType() {
        /*  861 */ rb = ResourceBundle.getBundle("config");
        /*  862 */ return Long.valueOf(rb.getString("attachment.type.attachtypeHistory"));
    }

    public static Long getApproveBalanceAttachmentType() {
        /*  866 */ rb = ResourceBundle.getBundle("config");
        /*  867 */ return Long.valueOf(rb.getString("attachment.type.ApproveBalance"));
    }

    public static Long getTransferStartWorkAttachmentType() {
        /*  871 */ rb = ResourceBundle.getBundle("config");
        /*  872 */ return Long.valueOf(rb.getString("attachment.type.transfer.startWork"));
    }

    public static Long getTransferConstrAttachmentType() {
        /*  876 */ rb = ResourceBundle.getBundle("config");
        /*  877 */ return Long.valueOf(rb.getString("attachment.type.transfer.constrConstruction"));
    }

    public static String getTransferStartWorkttachmentTypeLabel(Long type) {
        /*  881 */ rb = ResourceBundle.getBundle("config");
        /*  882 */ return rb.getString("attachment.label." + type.toString());
    }

    public static String getTransferConstrAttachmentTypeLabel(Long type) {
        /*  886 */ rb = ResourceBundle.getBundle("config");
        /*  887 */ return rb.getString("attachment.label." + type.toString());
    }

    public static Long getWaitForStartingConstrStatusCode() {
        /*  895 */ rb = ResourceBundle.getBundle("config");
        /*  896 */ return Long.valueOf(rb.getString("construction.statusCode.waitForStarting"));
    }

    public static Long getStartedConstrStatusCode() {
        /*  904 */ rb = ResourceBundle.getBundle("config");
        /*  905 */ return Long.valueOf(rb.getString("construction.statusCode.started"));
    }

    public static Long getCompletedConstrStatusCode() {
        /*  913 */ rb = ResourceBundle.getBundle("config");
        /*  914 */ return Long.valueOf(rb.getString("construction.statusCode.completed"));
    }

    public static Long getAcceptedConstrStatusCode() {
        /*  922 */ rb = ResourceBundle.getBundle("config");
        /*  923 */ return Long.valueOf(rb.getString("construction.statusCode.accepted"));
    }

    public static Long getTransferedConstrStatusCode() {
        /*  927 */ rb = ResourceBundle.getBundle("config");
        /*  928 */ return Long.valueOf(rb.getString("construction.statusCode.transfered"));
    }

    public static Long getCreatedRecordConstrStatusCode() {
        /*  936 */ rb = ResourceBundle.getBundle("config");
        /*  937 */ return Long.valueOf(rb.getString("construction.statusCode.createdrecord"));
    }

    public static Long getConsideredConstrStatusCode() {
        /*  945 */ rb = ResourceBundle.getBundle("config");
        /*  946 */ return Long.valueOf(rb.getString("construction.statusCode.considered"));
    }

    public static Long getLiquidatedConstrStatusCode() {
        /*  954 */ rb = ResourceBundle.getBundle("config");
        /*  955 */ return Long.valueOf(rb.getString("construction.statusCode.liquidated"));
    }

    public static Long getWaitForStartingWorkItemStatusCode() {
        /*  963 */ rb = ResourceBundle.getBundle("config");
        /*  964 */ return Long.valueOf(rb.getString("workItem.statusCode.waitForStarting"));
    }

    public static Long getStartedWorkItemStatusCode() {
        /*  968 */ rb = ResourceBundle.getBundle("config");
        /*  969 */ return Long.valueOf(rb.getString("workItem.statusCode.started"));
    }

    public static Long getCompletedWorkItemStatusCode() {
        /*  977 */ rb = ResourceBundle.getBundle("config");
        /*  978 */ return Long.valueOf(rb.getString("workItem.statusCode.completed"));
    }

    public static Long getAcceptedWorkItemStatusCode() {
        /*  986 */ rb = ResourceBundle.getBundle("config");
        /*  987 */ return Long.valueOf(rb.getString("workItem.statusCode.accepted"));
    }

    public static Long getTransferedWorkItemStatusCode() {
        /*  995 */ rb = ResourceBundle.getBundle("config");
        /*  996 */ return Long.valueOf(rb.getString("workItem.statusCode.transfered"));
    }

    public static Long getLiquidatedWorkItemStatusCode() {
        /* 1004 */ rb = ResourceBundle.getBundle("config");
        /* 1005 */ return Long.valueOf(rb.getString("workItem.statusCode.liquidated"));
    }

    public static String getResult() {
        /* 1014 */ rb = ResourceBundle.getBundle("message");
        /* 1015 */ return rb.getString("result");
    }

    public static String getAddModuleSuccess() {
        /* 1024 */ rb = ResourceBundle.getBundle("message");
        /* 1025 */ return rb.getString("addModule.addSuccess");
    }

    public static String getAddRoleSuccess() {
        /* 1034 */ rb = ResourceBundle.getBundle("message");
        /* 1035 */ return rb.getString("addRole.addSuccess");
    }

    public static String getExistRoleMsg() {
        /* 1044 */ rb = ResourceBundle.getBundle("message");
        /* 1045 */ return rb.getString("addRole.existRole");
    }

    public static String getDeletedRoleMsg() {
        /* 1054 */ rb = ResourceBundle.getBundle("message");
        /* 1055 */ return rb.getString("addRole.deletedRole");
    }

    public static String getLockRoleMsg() {
        /* 1064 */ rb = ResourceBundle.getBundle("message");
        /* 1065 */ return rb.getString("addRole.lockRole");
    }

    public static String getPathImportConfigFile() {
        /* 1074 */ rb = ResourceBundle.getBundle("config");
        /* 1075 */ return rb.getString("import.configFile");
    }

    public static String getMsgErrMaxLength() {
        /* 1079 */ rb = ResourceBundle.getBundle("message");
        /* 1080 */ return rb.getString("import.desErrMaxLength");
    }

    public static String getMsgErrMinLength() {
        /* 1085 */ rb = ResourceBundle.getBundle("message");
        /* 1086 */ return rb.getString("import.desErrMinLength");
    }

    public static String getMsgErrColumnName() {
        /* 1091 */ rb = ResourceBundle.getBundle("message");
        /* 1092 */ return rb.getString("import.desErrLabel");
    }

    public static String getMsgErrRequire() {
        /* 1096 */ rb = ResourceBundle.getBundle("message");
        /* 1097 */ return rb.getString("import.desErrRequire");
    }

    public static String getMsgErrBranch() {
        /* 1101 */ rb = ResourceBundle.getBundle("message");
        /* 1102 */ return rb.getString("import.desErrBranch");
    }

    public static String getMsgErrDuplicateRecord() {
        /* 1105 */ rb = ResourceBundle.getBundle("message");
        /* 1106 */ return rb.getString("import.duplicate");
    }

    public static String getMsgErrNotExistRole() {
        /* 1109 */ rb = ResourceBundle.getBundle("message");
        /* 1110 */ return rb.getString("import.notExistRole");
    }

    public static String getMsgErrDuplicateUser() {
        /* 1113 */ rb = ResourceBundle.getBundle("message");
        /* 1114 */ return rb.getString("import.desErrDuplicateUser");
    }

    static String getMsgErrNotExistDept() {
        /* 1119 */ rb = ResourceBundle.getBundle("message");
        /* 1120 */ return rb.getString("import.notExistDept");
    }

    public static String getMsgErrDeletedUser() {
        /* 1123 */ rb = ResourceBundle.getBundle("message");
        /* 1124 */ return rb.getString("import.desErrDeletedUser");
    }

    public static String getMsgErrGroup() {
        /* 1129 */ rb = ResourceBundle.getBundle("message");
        /* 1130 */ return rb.getString("import.desErrGroup");
    }

    public static String getMsgErrPosition() {
        /* 1134 */ rb = ResourceBundle.getBundle("message");
        /* 1135 */ return rb.getString("import.desErrPosition");
    }

    public static String getMsgErrStatus() {
        /* 1139 */ rb = ResourceBundle.getBundle("message");
        /* 1140 */ return rb.getString("import.desErrStatus");
    }

    public static String getMsgErrCountColumn() {
        /* 1144 */ rb = ResourceBundle.getBundle("message");
        /* 1145 */ return rb.getString("import.desErrCountColumn");
    }

    public static String getMsgImportSuccess() {
        /* 1149 */ rb = ResourceBundle.getBundle("message");
        /* 1150 */ return rb.getString("import.desImportUserSuccess");
    }

    public static String getStatusActive() {
        /* 1154 */ rb = ResourceBundle.getBundle("message");
        /* 1155 */ return rb.getString("account.active");
    }

    public static String getStatusInActive() {
        /* 1159 */ rb = ResourceBundle.getBundle("message");
        /* 1160 */ return rb.getString("account.inactive");
    }

    public static String getMsgErrNotFoundInfoDept() {
        /* 1167 */ rb = ResourceBundle.getBundle("message");
        /* 1168 */ return rb.getString("import.notFoundInfoDept");
    }

    public static String getMsgErrorChangeStatusRoleUsed() {
        /* 1172 */ rb = ResourceBundle.getBundle("message");
        /* 1173 */ return rb.getString("error.changeStatusRole");
    }

    public static String getMsgErrorDeleteRoleUsed() {
        /* 1177 */ rb = ResourceBundle.getBundle("message");
        /* 1178 */ return rb.getString("error.deleteUsedRoles");
    }

    public static String getMsgErrDeleteObjectUsed() {
        /* 1181 */ rb = ResourceBundle.getBundle("message");
        /* 1182 */ return rb.getString("object.deleteUsedObject");
    }

    public static String getMsgErrChangeStatusObjectUsed() {
        /* 1185 */ rb = ResourceBundle.getBundle("message");
        /* 1186 */ return rb.getString("error.changeStatusObject");
    }

    public static String getMsgErrNotExistApplication() {
        /* 1189 */ rb = ResourceBundle.getBundle("message");
        /* 1190 */ return rb.getString("import.notExistApplication");
    }

    public static int getConfigDeptIdColumn() {
        /* 1194 */ rb = ResourceBundle.getBundle("config");
        /* 1195 */ return Integer.parseInt(rb.getString("config.deptIdColumn"));
    }

    public static int getConfigDeptIdRow() {
        /* 1200 */ rb = ResourceBundle.getBundle("config");
        /* 1201 */ return Integer.parseInt(rb.getString("config.deptIdRow"));
    }

    public static int getConfigDeptNameColumn() {
        /* 1206 */ rb = ResourceBundle.getBundle("config");
        /* 1207 */ return Integer.parseInt(rb.getString("config.deptnameColumn"));
    }

    public static int getConfigDeptNameRow() {
        /* 1212 */ rb = ResourceBundle.getBundle("config");
        /* 1213 */ return Integer.parseInt(rb.getString("config.deptnameRow"));
    }

    public static int getConfigSheetApp() {
        /* 1218 */ rb = ResourceBundle.getBundle("config");
        /* 1219 */ return Integer.parseInt(rb.getString("config.sheetApp"));
    }

    public static int getConfigColumnApp() {
        /* 1224 */ rb = ResourceBundle.getBundle("config");
        /* 1225 */ return Integer.parseInt(rb.getString("config.columnApp"));
    }

    public static int getConfigRowApp() {
        /* 1230 */ rb = ResourceBundle.getBundle("config");
        /* 1231 */ return Integer.parseInt(rb.getString("config.rowApp"));
    }

    public static String getMsgErrNotFoundAppInExcel() {
        /* 1236 */ rb = ResourceBundle.getBundle("message");
        /* 1237 */ return rb.getString("import.notFoundAppInExcel");
    }

    public static String getMaxRowResult() {
        /* 1242 */ rb = ResourceBundle.getBundle("config");
        /* 1243 */ return rb.getString("maxRow");
    }

    public static String getDefaulPassword() {
        /* 1247 */ rb = ResourceBundle.getBundle("config");
        /* 1248 */ return rb.getString("depaultPassword");
    }

    public static String getStaffId() {
        /* 1253 */ rb = ResourceBundle.getBundle("config");
        /* 1254 */ return rb.getString("staffId");
    }

    /**
     * lay application resource
     * @param key : key
     * @return String : string
     */
    public static String getMailResource(String key) {
        ResourceBundle rb = ResourceBundle.getBundle("Mail");
        return rb.getString(key);
    }
}

/* Location:           D:\lifetek\Projects\CAS\LTACCOUNT-IPT\New folder\ltaccounts\WEB-INF\classes\
 * Qualified Name:     com.lifetek.ltaccounts.util.ResourceBundleUtils
 * JD-Core Version:    0.6.2
 */
