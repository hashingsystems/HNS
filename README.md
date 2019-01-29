# Hedera Name Service

HNS is a decentralised solution to address accounts on hashgraph using human readable names

## What is it?

HNS ties your Hedera Identity to a registered .hbar domain. The powerful problem we have solved is enabling simple peer-to-peer payments through vanity dns name service. So you do not need to fill in the Account ID or send any long strings. Usablity is great driver of adoption so we've simplified the process of transacting on Hedera Hashgraph.

## How does it work

  ## Registering a .hbar domain
  
  Once a user verifies the availability of .hbar address they can send payment which sends a transaction to the HNS Account ID. Once the payment is confirmed it returns a reciept to the sending Account ID and registers the DNS record assigning the user Account ID to unique domain submitted.
  
  The Hedera File Storage system retains record that stores the Account ID which made payment and associated .hbar domain. This cost to register a .hbar domain is 42 hbar. The file will auto expire after 365 days unless the timestamp is extended with a new annual payment.
  
  ## How transactions are mapped to Hedera Account IDs
  
  When a payment is sent we map the .hbar address to the registered Account ID. This lookup process makes sending and receving  as simple as sharing an email address to recieve payments at. 

## Getting Started 

### Running examples

## Prerequisites 

## Installing 


# Overview

## 💡 What is Hashgraph?
What is Hashgraph

## 💡 What is HNS?
HNS – or hash name system – is the protocol on the internet that turns human-comprehensible website names such as ‘website.hbar’ or ‘mywebsite.hbar’ into addresses understandable by decentralized network machines.

## 📝 Description

HNS is the Hashgraph Name Service, a distributed, open, and extensible naming system based on the Hashgraph protocol.

## 📚 Documents

#### Table of Contents
- [Introduction](./docs/INTRODUCTION.md)
- [Implementation](./docs/IMPLEMENTATION.md)
    - [Registry](./docs/REGISTRY.md)
    - [Registrar](./docs/REGISTRAR.md)
    - [Resolver](./docs/RESOLVER.md)
- [Integration](./docs/INTEGRATION.md)

## 📝 Guideline
- [Smart Contract Testing](./HNS/README.md)
- [Smart Contract Deploy](./guides/tut.md)
- [HNS Deploy](./guides/deploy.md)

## 🗂️ Hashgraph Technical Stack
Hash Name Service (HNS) is governed by three components; A registrar, registry, and resolver. They contain the core logic for the Hash Name Service implementation, from the ownership managment for a domain, to the global resolving layer that is reposible for connecting different tech stacks and enhances the usability for different infrastructures.

### State Layer
State layer is where user’s “state”, or user’s information and behavior, is stored. Hashgraph FS is where these data are stored, and gives users the ability to control their own state.

### Computation Layer
---
### Component Layer
The design of digital assets can have more functions through combing the State Layer and Computation Layer, such as : crypto assets, and identities. Those programmable assets has many more potential usages and sub-economies within. TNS includes three major component:

A registry component stores all the information relative to a domain, and can operate the set of logics to map between the TomoChain domains and its owners.
A registrar component governs the domain purchase through the customized auction or trading rules.
A resolver component processes the corresponding resources from wallet address to decentralized application or website on TomoChain.

### Protocol Layer
On the Protocol Layer, we will be presenting our BNS (Blockchain Name Service) standards that can make the TNS more efficient and applicable. With the state, computation and component layers behind the scene, protocol layer serve as a gateway for users and developers to interact with our TNS standard.

### User Control Layer
User control layer is in charge of managing private keys to communicate with the state layer. TNS empowers users to control, set up and manage their digital asset with an easier and readable text, which could be further utilized in the next application layer.

### Application Layer
HNS can be implemented into many other applications on Hashgraph, such as wallet that can resolve HNS, dApp that utilize HNS for users identity and many more. We believe that it is an essential components to provide a better environment for both technical and non-technical users.

## ⚙️ HNS smart contract test coverage
__Continuous updating__
- [Coverage Report](./hns/coverage/)

## 🎯 HNS Deploy

## 🗃 Changelog
See [CHANGELOG.md](./CHANGELOG.md).

## 📣 Contributing
See [CONTRIBUTING.md](./CONTRIBUTING.md) for how to help out.

## 🗒 Licence
See [LICENSE](./LICENSE) for details.
