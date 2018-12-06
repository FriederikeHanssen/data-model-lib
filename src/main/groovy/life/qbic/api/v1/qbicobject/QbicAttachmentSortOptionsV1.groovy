package life.qbic.api.v1.qbicobject

import ch.ethz.sis.openbis.generic.asapi.v3.dto.attachment.fetchoptions.AttachmentSortOptions
import life.qbic.api.v1.openbis.adapter.AttachmentSortOptionsAdapter

protected class QbicAttachmentSortOptionsV1 implements AttachmentSortOptionsAdapter {
    //TODO doesn't seem to have any methods to implement
    private final AttachmentSortOptions openbisAttachmentSortOptions

    QbicAttachmentSortOptionsV1(openbisAttachmentSortOptions){
        this.openbisAttachmentSortOptions = openbisAttachmentSortOptions
    }
}
