# CryptoTextAndroid
An android library to convert plain text to cipher text

## How to:

To get a Git project into your build:

### Step 1. Add the JitPack repository to your build file
Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
  

### Step 2. Add the dependency

	dependencies {
		implementation 'com.github.Tobibur:CryptoTextAndroid:0.1.0'
	}
  
  
  
  [![](https://jitpack.io/v/Tobibur/CryptoTextAndroid.svg)](https://jitpack.io/#Tobibur/CryptoTextAndroid)

## Usage:

### 1. Create an object of the Class CryptoText

```Java
CryptoText cryptoText = new CryptoText();
```

### 2. For Encryption

```Java
String code = cryptoText.encryptInput(text);
```

### 3. For Decryption

```Java
String decode = cryptoText.decryptOutput(code);
```

Thats it! :)

## License & Copyright
Licensed under the [MIT Licence](LICENSE)

