package life.qbic.api.v1.openbis.adapter

/**
 * Provides an access interface for `QbicAttachmentFetchOptionsVX` objects.
 * http://svnsis.ethz.ch/doc/openbis/18.06.2/javadoc/ serves as guide for necessary methods
 * Currently focusing on getters alone
 * @author: Friederike Hanssen, QBiC
 * TODO: add setters
 */

interface AttachmentFetchOptionsAdapter {

    FetchOptionsToStringBuilderAdapter getFetchOptionsStringBuilder()

    AttachmentSortOptionsAdapter getSortBy()

    boolean hasContent()

    boolean hasPreviousVersion()

    boolean hasRegistrator()

    AttachmentSortOptionsAdapter sortBy()

    EmptyFetchOptionsAdapter withContent()

    EmptyFetchOptionsAdapter withContentUsing(Object fetchOptions)

    AttachmentFetchOptionsAdapter withPreviousVersion()

    AttachmentFetchOptionsAdapter withPreviousVersionUsing(Object fetchOptionsAdapter)

    PersonFetchOptionsAdapter withRegistrator()

    PersonFetchOptionsAdapter withRegistratorUsing(Object fetchOptions)


}
