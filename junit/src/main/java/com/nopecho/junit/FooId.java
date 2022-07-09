package com.nopecho.junit;

import lombok.Data;
import lombok.Value;

@Data
@Value(staticConstructor = "of")
public class FooId {

    Long id;
}
