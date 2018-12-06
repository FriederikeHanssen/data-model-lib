package life.qbic.api.v1.qbicobject

import ch.ethz.sis.openbis.generic.asapi.v3.dto.attachment.fetchoptions.AttachmentFetchOptions
import life.qbic.api.v1.openbis.adapter.AttachmentFetchOptionsAdapter
import life.qbic.api.v1.openbis.adapter.AttachmentSortOptionsAdapter
import life.qbic.api.v1.openbis.adapter.EmptyFetchOptionsAdapter
import life.qbic.api.v1.openbis.adapter.FetchOptionsToStringBuilderAdapter
import life.qbic.api.v1.openbis.adapter.PersonFetchOptionsAdapter

protected class QbicAttachmentFetchOptionsV1 implements AttachmentFetchOptionsAdapter{

    private final AttachmentFetchOptions openbisAttachmentFetchOptions

    QbicAttachmentFetchOptionsV1(openbisAttachmentFetchOptions){
        this.openbisAttachmentFetchOptions = openbisAttachmentFetchOptions;
    }

    @Override
    FetchOptionsToStringBuilderAdapter getFetchOptionsStringBuilder() {
        return new QbicFetchOptionsStringBuilderV1(this.openbisAttachmentFetchOptions.getFetchOptionsStringBuilder())
    }

    @Override
    AttachmentSortOptionsAdapter getSortBy() {
        return new QbicAttachmentSortOptionsV1(this.openbisAttachmentFetchOptions.getSortBy())
    }

    @Override
    boolean hasContent() {
        return this.openbisAttachmentFetchOptions.hasContent()
    }

    @Override
    boolean hasPreviousVersion() {
        return this.openbisAttachmentFetchOptions.hasPreviousVersion()
    }

    @Override
    boolean hasRegistrator() {
        return this.openbisAttachmentFetchOptions.hasRegistrator()
    }

    @Override
    AttachmentSortOptionsAdapter sortBy() {
        return new QbicAttachmentSortOptionsV1(this.openbisAttachmentFetchOptions.sortBy())
    }

    @Override
    EmptyFetchOptionsAdapter withContent() {
        return new QbicEmptyFetchOptionsV1(this.openbisAttachmentFetchOptions.withContent())
    }

    @Override
    EmptyFetchOptionsAdapter withContentUsing(Object fetchOptions) {
        //TODO the object is an EmptyFetchOptions object: however; than I have to pass OpenBis object...think this should be avoided? maybe getter for the opneBis object could solve this
        return new QbicEmptyFetchOptionsV1(this.openbisAttachmentFetchOptions.withContentUsing(fetchOptions))
    }

    @Override
    AttachmentFetchOptionsAdapter withPreviousVersion() {
        return new QbicAttachmentFetchOptionsV1(this.openbisAttachmentFetchOptions.withPreviousVersion())
    }

    @Override
    AttachmentFetchOptionsAdapter withPreviousVersionUsing(Object fetchOptionsAdapter) {
        //TODO the object is an AttachementFetchOptions object: however; than I have to pass OpenBis object...think this should be avoided? maybe getter for the opneBis object could solve this
        return new QbicAttachmentFetchOptionsV1(this.openbisAttachmentFetchOptions.withPreviousVersionUsing(fetchOptionsAdapter))
    }

    @Override
    PersonFetchOptionsAdapter withRegistrator() {
        return new QbicPersonV1(this.openbisAttachmentFetchOptions.withRegistrator())
    }

    @Override
    PersonFetchOptionsAdapter withRegistratorUsing(Object fetchOptions) {
        //TODO the object is an PersonFetchOptions object: however; than I have to pass OpenBis object...think this should be avoided? maybe getter for the opneBis object could solve this
        return new QbicPersonV1(this.openbisAttachmentFetchOptions.withRegistratorUsing(fetchOptions))
    }
}
