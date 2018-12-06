package life.qbic.api.v1.openbis.adapter

interface EntityTypePermIdAdapter {

    boolean equals(Object obj)

    EntityKindAdapter getEntityKind()

    String toString()
}