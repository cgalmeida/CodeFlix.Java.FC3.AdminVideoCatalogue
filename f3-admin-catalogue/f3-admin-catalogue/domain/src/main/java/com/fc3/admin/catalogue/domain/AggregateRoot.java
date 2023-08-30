package com.fc3.admin.catalogue.domain;

public class AggregateRoot<ID extends Identifier> extends Entity<ID> {

    protected AggregateRoot(final ID id) {
        super(id);
    }
}
