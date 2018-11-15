package life.qbic.api.v1.qbicobject

import life.qbic.api.v1.openbis.adapter.AttachmentAdapter

class QbicAttachmentV1 implements AttachmentAdapter{


    @Override
    byte[] getContent() {
        return new byte[0]
    }

    @Override
    String getDescription() {
        return null
    }

    @Override
    QbicAttachmentFetchOptions getFetchOptions() {
        return null
    }

    @Override
    String getFileName() {
        return null
    }

    @Override
    String getLatestVersionPermlink() {
        return null
    }

    @Override
    String getPermlink() {
        return null
    }

    @Override
    QbicAttachmentV1 getPreviousVersion() {
        return null
    }

    @Override
    Date getRegistrationDate() {
        return null
    }

    @Override
    QbicPersonV1 getRegistrator() {
        return null
    }

    @Override
    String getTitle() {
        return null
    }

    @Override
    Integer getVersion() {
        return null
    }
}
