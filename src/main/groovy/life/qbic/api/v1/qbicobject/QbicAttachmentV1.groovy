package life.qbic.api.v1.qbicobject

import ch.ethz.sis.openbis.generic.asapi.v3.dto.attachment.Attachment
import life.qbic.api.v1.openbis.adapter.AttachmentAdapter
import life.qbic.api.v1.openbis.adapter.AttachmentFetchOptionsAdapter
import life.qbic.api.v1.openbis.adapter.PersonAdapter

protected class QbicAttachmentV1 implements AttachmentAdapter{

    private final Attachment openbisAttachment

    QbicAttachmentV1(openbisAttachment){
        this.openbisAttachment = openbisAttachment
    }

    @Override
    byte[] getContent() {
        return this.openbisAttachment.getContent()
    }

    @Override
    String getDescription() {
        return this.openbisAttachment.getDescription()
    }

    @Override
    AttachmentFetchOptionsAdapter getFetchOptions() {
        return new QbicAttachmentFetchOptionsV1(this.openbisAttachment.getFetchOptions())
    }

    @Override
    String getFileName() {
        return this.openbisAttachment.getFileName()
    }

    @Override
    String getLatestVersionPermlink() {
        return this.openbisAttachment.getLatestVersionPermlink()
    }

    @Override
    String getPermlink() {
        return this.openbisAttachment.getPermlink()
    }

    @Override
    AttachmentAdapter getPreviousVersion() {
        return new QbicAttachmentV1(this.openbisAttachment.getPreviousVersion())
    }

    @Override
    Date getRegistrationDate() {
        return this.openbisAttachment.getRegistrationDate()
    }

    @Override
    PersonAdapter getRegistrator() {
        return new QbicPersonV1(this.openbisAttachment.getRegistrator())
    }

    @Override
    String getTitle() {
        return this.openbisAttachment.getTitle()
    }

    @Override
    Integer getVersion() {
        return this.openbisAttachment.getVersion()
    }
}
