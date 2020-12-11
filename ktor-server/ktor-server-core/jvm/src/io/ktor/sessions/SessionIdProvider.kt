/*
 * Copyright 2014-2020 JetBrains s.r.o and contributors. Use of this source code is governed by the Apache 2.0 license.
 */

package io.ktor.sessions

import io.ktor.util.*

/**
 * Generates a secure random session ID
 */
public fun generateSessionId(): String = generateNonce() + generateNonce()
