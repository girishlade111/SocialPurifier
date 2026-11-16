package com.revenuecat.purchases;

import a5.z;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.strings.ConfigureStrings;
import qf.k;
import qf.r;

/* JADX INFO: loaded from: classes.dex */
public final class APIKeyValidator {

    public enum APIKeyPlatform {
        GOOGLE,
        AMAZON,
        GALAXY,
        LEGACY,
        TEST,
        OTHER_PLATFORM
    }

    public enum ValidationResult {
        VALID,
        GOOGLE_KEY_AMAZON_STORE,
        GOOGLE_KEY_GALAXY_STORE,
        AMAZON_KEY_GOOGLE_STORE,
        AMAZON_KEY_GALAXY_STORE,
        GALAXY_KEY_GOOGLE_STORE,
        GALAXY_KEY_AMAZON_STORE,
        LEGACY,
        SIMULATED_STORE,
        OTHER_PLATFORM
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ValidationResult.values().length];
            try {
                iArr[ValidationResult.AMAZON_KEY_GOOGLE_STORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ValidationResult.GOOGLE_KEY_AMAZON_STORE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ValidationResult.GALAXY_KEY_GOOGLE_STORE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ValidationResult.GOOGLE_KEY_GALAXY_STORE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ValidationResult.GALAXY_KEY_AMAZON_STORE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ValidationResult.AMAZON_KEY_GALAXY_STORE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ValidationResult.LEGACY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ValidationResult.OTHER_PLATFORM.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ValidationResult.SIMULATED_STORE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ValidationResult.VALID.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final APIKeyPlatform getApiKeyPlatform(String str) {
        if (r.p0(str, "goog_", false)) {
            return APIKeyPlatform.GOOGLE;
        }
        if (r.p0(str, "amzn_", false)) {
            return APIKeyPlatform.AMAZON;
        }
        if (r.p0(str, "galx_", false)) {
            return APIKeyPlatform.GALAXY;
        }
        if (r.p0(str, "test_", false)) {
            return APIKeyPlatform.TEST;
        }
        return !k.u0(str, '_') ? APIKeyPlatform.LEGACY : APIKeyPlatform.OTHER_PLATFORM;
    }

    private final void logValidationResult(ValidationResult validationResult) {
        switch (WhenMappings.$EnumSwitchMapping$0[validationResult.ordinal()]) {
            case 1:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", ConfigureStrings.AMAZON_API_KEY_GOOGLE_STORE, null);
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", ConfigureStrings.GOOGLE_API_KEY_AMAZON_STORE, null);
                break;
            case 3:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", ConfigureStrings.GALAXY_API_KEY_GOOGLE_STORE, null);
                break;
            case 4:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", ConfigureStrings.GOOGLE_API_KEY_GALAXY_STORE, null);
                break;
            case 5:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", ConfigureStrings.GALAXY_API_KEY_AMAZON_STORE, null);
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", ConfigureStrings.AMAZON_API_KEY_GALAXY_STORE, null);
                break;
            case 7:
                LogLevel logLevel = LogLevel.DEBUG;
                LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    z.n(logLevel, new StringBuilder("[Purchases] - "), currentLogHandler, ConfigureStrings.LEGACY_API_KEY);
                }
                break;
            case 8:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", ConfigureStrings.INVALID_API_KEY, null);
                break;
            case 9:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), ConfigureStrings.SIMULATED_STORE_API_KEY);
                }
                break;
        }
    }

    private final ValidationResult validate(String str, Store store) {
        APIKeyPlatform apiKeyPlatform = getApiKeyPlatform(str);
        if (apiKeyPlatform == APIKeyPlatform.TEST) {
            return ValidationResult.SIMULATED_STORE;
        }
        APIKeyPlatform aPIKeyPlatform = APIKeyPlatform.GOOGLE;
        if (apiKeyPlatform == aPIKeyPlatform && store == Store.PLAY_STORE) {
            return ValidationResult.VALID;
        }
        APIKeyPlatform aPIKeyPlatform2 = APIKeyPlatform.AMAZON;
        if (apiKeyPlatform == aPIKeyPlatform2 && store == Store.AMAZON) {
            return ValidationResult.VALID;
        }
        APIKeyPlatform aPIKeyPlatform3 = APIKeyPlatform.GALAXY;
        if (apiKeyPlatform == aPIKeyPlatform3 && store == Store.GALAXY) {
            return ValidationResult.VALID;
        }
        if (apiKeyPlatform == aPIKeyPlatform && store == Store.AMAZON) {
            return ValidationResult.GOOGLE_KEY_AMAZON_STORE;
        }
        if (apiKeyPlatform == aPIKeyPlatform2 && store == Store.PLAY_STORE) {
            return ValidationResult.AMAZON_KEY_GOOGLE_STORE;
        }
        if (apiKeyPlatform == aPIKeyPlatform && store == Store.GALAXY) {
            return ValidationResult.GOOGLE_KEY_GALAXY_STORE;
        }
        if (apiKeyPlatform == aPIKeyPlatform3 && store == Store.PLAY_STORE) {
            return ValidationResult.GALAXY_KEY_GOOGLE_STORE;
        }
        if (apiKeyPlatform == aPIKeyPlatform3 && store == Store.AMAZON) {
            return ValidationResult.GALAXY_KEY_AMAZON_STORE;
        }
        if (apiKeyPlatform == aPIKeyPlatform2 && store == Store.GALAXY) {
            return ValidationResult.AMAZON_KEY_GALAXY_STORE;
        }
        if (apiKeyPlatform == APIKeyPlatform.LEGACY) {
            return ValidationResult.LEGACY;
        }
        return apiKeyPlatform == APIKeyPlatform.OTHER_PLATFORM ? ValidationResult.OTHER_PLATFORM : ValidationResult.OTHER_PLATFORM;
    }

    public final String redactApiKey(String str) {
        String strY0;
        String strSubstring;
        str.getClass();
        int iD0 = k.D0(str, '_', 0, 6);
        if (iD0 == -1) {
            strY0 = "";
            strSubstring = str;
        } else {
            int i2 = iD0 + 1;
            strY0 = k.Y0(i2, str);
            strSubstring = str.substring(i2);
        }
        if (strSubstring.length() < 6) {
            return str;
        }
        String strY1 = k.Y0(2, strSubstring);
        int length = strSubstring.length();
        return strY0 + strY1 + "********" + strSubstring.substring(length - (4 > length ? length : 4));
    }

    public final ValidationResult validateAndLog(String str, Store store) {
        str.getClass();
        store.getClass();
        ValidationResult validationResultValidate = validate(str, store);
        logValidationResult(validationResultValidate);
        return validationResultValidate;
    }
}
