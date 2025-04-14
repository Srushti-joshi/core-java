package internal;

public class Chaining {
    public void greetNeighbor(Neighbor neighbor) {
        if (neighbor != null) {
            neighbor.greet();
            if (neighbor instanceof NextDoorNeighbor) {
                NextDoorNeighbor next = (NextDoorNeighbor) neighbor;
                next.borrowSugar();
            } else {
                System.err.println("Neighbor is not NextDoorNeighbor");
            }
        } else {
            System.err.println("Neighbor is null..");
        }
    }

    public void performSong(Song song) {
        if (song != null) {
            song.sing();
            if (song instanceof NurserySong) {
                NurserySong nursery = (NurserySong) song;
                nursery.teachAlphabet();
            } else {
                System.err.println("Song is not NurserySong");
            }
        } else {
            System.err.println("Song is null..");
        }
    }

    public void organizeMeeting(Meeting meeting) {
        if (meeting != null) {
            meeting.schedule();
            if (meeting instanceof OfficeMeeting) {
                OfficeMeeting office = (OfficeMeeting) meeting;
                office.discussAgenda();
            } else {
                System.err.println("Meeting is not OfficeMeeting");
            }
        } else {
            System.err.println("Meeting is null..");
        }
    }

    public void makeCraft(Craft craft) {
        if (craft != null) {
            craft.create();
            if (craft instanceof PaperBoat) {
                PaperBoat paperBoat = (PaperBoat) craft;
                paperBoat.floatInWater();
            } else {
                System.err.println("Craft is not PaperBoat");
            }
        } else {
            System.err.println("Craft is null..");
        }
    }

    public void explorePlace(Place place) {
        if (place != null) {
            place.visit();
            if (place instanceof Park) {
                Park park = (Park) place;
                park.play();
            } else {
                System.err.println("Place is not Park");
            }
        } else {
            System.err.println("Place is null..");
        }
    }
    public void handleNeighborInteraction(Neighbor neighbor) {
        if (neighbor != null) {
            neighbor.greet();
            if (neighbor instanceof NextDoorNeighbor) {
                NextDoorNeighbor next = (NextDoorNeighbor) neighbor;
                next.borrowSugar();
            } else {
                System.err.println("Neighbor is not NextDoorNeighbor");
            }
        } else {
            System.err.println("Neighbor is null..");
        }
    }

    public void handleSongPerformance(Song song) {
        if (song != null) {
            song.sing();
            if (song instanceof NurserySong) {
                NurserySong nursery = (NurserySong) song;
                nursery.teachAlphabet();
            } else {
                System.err.println("Song is not NurserySong");
            }
        } else {
            System.err.println("Song is null..");
        }
    }

    public void handleMeetingSchedule(Meeting meeting) {
        if (meeting != null) {
            meeting.schedule();
            if (meeting instanceof OfficeMeeting) {
                OfficeMeeting office = (OfficeMeeting) meeting;
                office.discussAgenda();
            } else {
                System.err.println("Meeting is not OfficeMeeting");
            }
        } else {
            System.err.println("Meeting is null..");
        }
    }

    public void handleCraftMaking(Craft craft) {
        if (craft != null) {
            craft.create();
            if (craft instanceof PaperBoat) {
                PaperBoat paperBoat = (PaperBoat) craft;
                paperBoat.floatInWater();
            } else {
                System.err.println("Craft is not PaperBoat");
            }
        } else {
            System.err.println("Craft is null..");
        }
    }

    public void handlePlaceVisit(Place place) {
        if (place != null) {
            place.visit();
            if (place instanceof Park) {
                Park park = (Park) place;
                park.play();
            } else {
                System.err.println("Place is not Park");
            }
        } else {
            System.err.println("Place is null..");
        }
    }
    public void interactWithNeighbor(Neighbor neighbor) {
        if (neighbor != null) {
            neighbor.greet();
            if (neighbor instanceof NextDoorNeighbor) {
                NextDoorNeighbor next = (NextDoorNeighbor) neighbor;
                next.borrowSugar();
            } else {
                System.err.println("Neighbor is not NextDoorNeighbor");
            }
        } else {
            System.err.println("Neighbor is null..");
        }
    }

    public void playSong(Song song) {
        if (song != null) {
            song.sing();
            if (song instanceof NurserySong) {
                NurserySong nursery = (NurserySong) song;
                nursery.teachAlphabet();
            } else {
                System.err.println("Song is not NurserySong");
            }
        } else {
            System.err.println("Song is null..");
        }
    }

    public void setupMeeting(Meeting meeting) {
        if (meeting != null) {
            meeting.schedule();
            if (meeting instanceof OfficeMeeting) {
                OfficeMeeting office = (OfficeMeeting) meeting;
                office.discussAgenda();
            } else {
                System.err.println("Meeting is not OfficeMeeting");
            }
        } else {
            System.err.println("Meeting is null..");
        }
    }

    public void createCraft(Craft craft) {
        if (craft != null) {
            craft.create();
            if (craft instanceof PaperBoat) {
                PaperBoat paperBoat = (PaperBoat) craft;
                paperBoat.floatInWater();
            } else {
                System.err.println("Craft is not PaperBoat");
            }
        } else {
            System.err.println("Craft is null..");
        }
    }

    public void visitPlace(Place place) {
        if (place != null) {
            place.visit();
            if (place instanceof Park) {
                Park park = (Park) place;
                park.play();
            } else {
                System.err.println("Place is not Park");
            }
        } else {
            System.err.println("Place is null..");
        }
    }
    public void respondToNeighbor(Neighbor neighbor) {
        if (neighbor != null) {
            neighbor.greet();
            if (neighbor instanceof NextDoorNeighbor) {
                NextDoorNeighbor next = (NextDoorNeighbor) neighbor;
                next.borrowSugar();
            } else {
                System.err.println("Neighbor is not NextDoorNeighbor");
            }
        } else {
            System.err.println("Neighbor is null..");
        }
    }

    public void singAndTeach(Song song) {
        if (song != null) {
            song.sing();
            if (song instanceof NurserySong) {
                NurserySong nursery = (NurserySong) song;
                nursery.teachAlphabet();
            } else {
                System.err.println("Song is not NurserySong");
            }
        } else {
            System.err.println("Song is null..");
        }
    }

    public void manageMeeting(Meeting meeting) {
        if (meeting != null) {
            meeting.schedule();
            if (meeting instanceof OfficeMeeting) {
                OfficeMeeting office = (OfficeMeeting) meeting;
                office.discussAgenda();
            } else {
                System.err.println("Meeting is not OfficeMeeting");
            }
        } else {
            System.err.println("Meeting is null..");
        }
    }

    public void craftAndTest(Craft craft) {
        if (craft != null) {
            craft.create();
            if (craft instanceof PaperBoat) {
                PaperBoat paperBoat = (PaperBoat) craft;
                paperBoat.floatInWater();
            } else {
                System.err.println("Craft is not PaperBoat");
            }
        } else {
            System.err.println("Craft is null..");
        }
    }

    public void exploreDestination(Place place) {
        if (place != null) {
            place.visit();
            if (place instanceof Park) {
                Park park = (Park) place;
                park.play();
            } else {
                System.err.println("Place is not Park");
            }
        } else {
            System.err.println("Place is null..");
        }
    }
    public void assistNeighborTask(Neighbor neighbor) {
        if (neighbor != null) {
            neighbor.greet();
            if (neighbor instanceof NextDoorNeighbor) {
                NextDoorNeighbor next = (NextDoorNeighbor) neighbor;
                next.borrowSugar();
            } else {
                System.err.println("Neighbor is not NextDoorNeighbor");
            }
        } else {
            System.err.println("Neighbor is null..");
        }
    }

    public void performNurserySong(Song song) {
        if (song != null) {
            song.sing();
            if (song instanceof NurserySong) {
                NurserySong nursery = (NurserySong) song;
                nursery.teachAlphabet();
            } else {
                System.err.println("Song is not NurserySong");
            }
        } else {
            System.err.println("Song is null..");
        }
    }

    public void initiateOfficeMeeting(Meeting meeting) {
        if (meeting != null) {
            meeting.schedule();
            if (meeting instanceof OfficeMeeting) {
                OfficeMeeting office = (OfficeMeeting) meeting;
                office.discussAgenda();
            } else {
                System.err.println("Meeting is not OfficeMeeting");
            }
        } else {
            System.err.println("Meeting is null..");
        }
    }

    public void startCraftActivity(Craft craft) {
        if (craft != null) {
            craft.create();
            if (craft instanceof PaperBoat) {
                PaperBoat paperBoat = (PaperBoat) craft;
                paperBoat.floatInWater();
            } else {
                System.err.println("Craft is not PaperBoat");
            }
        } else {
            System.err.println("Craft is null..");
        }
    }

    public void beginPlaceTour(Place place) {
        if (place != null) {
            place.visit();
            if (place instanceof Park) {
                Park park = (Park) place;
                park.play();
            } else {
                System.err.println("Place is not Park");
            }
        } else {
            System.err.println("Place is null..");
        }
    }
    public void handleNeighborVisit(Neighbor neighbor) {
        if (neighbor != null) {
            neighbor.greet();
            if (neighbor instanceof NextDoorNeighbor) {
                NextDoorNeighbor next = (NextDoorNeighbor) neighbor;
                next.borrowSugar();
            } else {
                System.err.println("Neighbor is not NextDoorNeighbor");
            }
        } else {
            System.err.println("Neighbor is null..");
        }
    }

    public void runSongRoutine(Song song) {
        if (song != null) {
            song.sing();
            if (song instanceof NurserySong) {
                NurserySong nursery = (NurserySong) song;
                nursery.teachAlphabet();
            } else {
                System.err.println("Song is not NurserySong");
            }
        } else {
            System.err.println("Song is null
            public void handleNeighborVisit(Neighbor neighbor) {
                if (neighbor != null) {
                    neighbor.greet();
                    if (neighbor instanceof NextDoorNeighbor) {
                        NextDoorNeighbor next = (NextDoorNeighbor) neighbor;
                        next.borrowSugar();
                    } else {
                        System.err.println("Neighbor is not NextDoorNeighbor");
                    }
                } else {
                    System.err.println("Neighbor is null..");
                }
            }

            public void runSongRoutine(Song song) {
                if (song != null) {
                    song.sing();
                    if (song instanceof NurserySong) {
                        NurserySong nursery = (NurserySong) song;
                        nursery.teachAlphabet();
                    } else {
                        System.err.println("Song is not NurserySong");
                    }
                } else {
                    System.err.println("Song is null..");
                }
            }

            public void conductMeeting(Meeting meeting) {
                if (meeting != null) {
                    meeting.schedule();
                    if (meeting instanceof OfficeMeeting) {
                        OfficeMeeting office = (OfficeMeeting) meeting;
                        office.discussAgenda();
                    } else {
                        System.err.println("Meeting is not OfficeMeeting");
                    }
                } else {
                    System.err.println("Meeting is null..");
                }
            }

            public void buildCraft(Craft craft) {
                if (craft != null) {
                    craft.create();
                    if (craft instanceof PaperBoat) {
                        PaperBoat paperBoat = (PaperBoat) craft;
                        paperBoat.floatInWater();
                    } else {
                        System.err.println("Craft is not PaperBoat");
                    }
                } else {
                    System.err.println("Craft is null..");
                }
            }

            public void checkOutPlace(Place place) {
                if (place != null) {
                    place.visit();
                    if (place instanceof Park) {
                        Park park = (Park) place;
                        park.play();
                    } else {
                        System.err.println("Place is not Park");
                    }
                } else {
                    System.err.println("Place is null..");
                }
            }
            public void executeNeighborInteraction(Neighbor neighbor) {
                if (neighbor != null) {
                    neighbor.greet();
                    if (neighbor instanceof NextDoorNeighbor) {
                        NextDoorNeighbor next = (NextDoorNeighbor) neighbor;
                        next.borrowSugar();
                    } else {
                        System.err.println("Neighbor is not NextDoorNeighbor");
                    }
                } else {
                    System.err.println("Neighbor is null..");
                }
            }

            public void deliverSongContent(Song song) {
                if (song != null) {
                    song.sing();
                    if (song instanceof NurserySong) {
                        NurserySong nursery = (NurserySong) song;
                        nursery.teachAlphabet();
                    } else {
                        System.err.println("Song is not NurserySong");
                    }
                } else {
                    System.err.println("Song is null..");
                }
            }

            public void planMeetingEvent(Meeting meeting) {
                if (meeting != null) {
                    meeting.schedule();
                    if (meeting instanceof OfficeMeeting) {
                        OfficeMeeting office = (OfficeMeeting) meeting;
                        office.discussAgenda();
                    } else {
                        System.err.println("Meeting is not OfficeMeeting");
                    }
                } else {
                    System.err.println("Meeting is null..");
                }
            }

            public void processCraftCreation(Craft craft) {
                if (craft != null) {
                    craft.create();
                    if (craft instanceof PaperBoat) {
                        PaperBoat paperBoat = (PaperBoat) craft;
                        paperBoat.floatInWater();
                    } else {
                        System.err.println("Craft is not PaperBoat");
                    }
                } else {
                    System.err.println("Craft is null..");
                }
            }

            public void guidePlaceExperience(Place place) {
                if (place != null) {
                    place.visit();
                    if (place instanceof Park) {
                        Park park = (Park) place;
                        park.play();
                    } else {
                        System.err.println("Place is not Park");
                    }
                } else {
                    System.err.println("Place is null..");
                }
            }
            public void manageNeighborGreeting(Neighbor neighbor) {
                if (neighbor != null) {
                    neighbor.greet();
                    if (neighbor instanceof NextDoorNeighbor) {
                        NextDoorNeighbor next = (NextDoorNeighbor) neighbor;
                        next.borrowSugar();
                    } else {
                        System.err.println("Neighbor is not NextDoorNeighbor");
                    }
                } else {
                    System.err.println("Neighbor is null..");
                }
            }

            public void handleSongActivity(Song song) {
                if (song != null) {
                    song.sing();
                    if (song instanceof NurserySong) {
                        NurserySong nursery = (NurserySong) song;
                        nursery.teachAlphabet();
                    } else {
                        System.err.println("Song is not NurserySong");
                    }
                } else {
                    System.err.println("Song is null..");
                }
            }

            public void coordinateMeeting(Meeting meeting) {
                if (meeting != null) {
                    meeting.schedule();
                    if (meeting instanceof OfficeMeeting) {
                        OfficeMeeting office = (OfficeMeeting) meeting;
                        office.discussAgenda();
                    } else {
                        System.err.println("Meeting is not OfficeMeeting");
                    }
                } else {
                    System.err.println("Meeting is null..");
                }
            }

            public void executeCraftProject(Craft craft) {
                if (craft != null) {
                    craft.create();
                    if (craft instanceof PaperBoat) {
                        PaperBoat paperBoat = (PaperBoat) craft;
                        paperBoat.floatInWater();
                    } else {
                        System.err.println("Craft is not PaperBoat");
                    }
                } else {
                    System.err.println("Craft is null..");
                }
            }

            public void experiencePlaceVisit(Place place) {
                if (place != null) {
                    place.visit();
                    if (place instanceof Park) {
                        Park park = (Park) place;
                        park.play();
                    } else {
                        System.err.println("Place is not Park");
                    }
                } else {
                    System.err.println("Place is null..");
                }
            }

}
