package org.wecancodeit.albumcollection;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;
import org.wecancodeit.albumcollection.models.Album;
import org.wecancodeit.albumcollection.models.Artist;
import org.wecancodeit.albumcollection.models.Comment;
import org.wecancodeit.albumcollection.models.Rating;
import org.wecancodeit.albumcollection.models.Song;
import org.wecancodeit.albumcollection.models.Tag;
import org.wecancodeit.albumcollection.repositories.AlbumRepository;
import org.wecancodeit.albumcollection.repositories.ArtistRepository;
import org.wecancodeit.albumcollection.repositories.SongRepository;
import org.wecancodeit.albumcollection.repositories.TagRepository;

@Service
public class Populator implements CommandLineRunner {

	@Resource
	ArtistRepository artistRepo;
	@Resource
	AlbumRepository albumRepo;
	@Resource
	SongRepository songRepo;

	@Resource
	TagRepository tagRepo;

	@Override
	public void run(String... args) throws Exception {

		Rating rating1 = new Rating(5);

		Comment comment1 = new Comment("Great");
		Comment comment2 = new Comment("Sucks");
		Comment comment3 = new Comment("Epic");

		Tag tag1 = tagRepo.save(new Tag("Cool"));

		
		Artist artist1 = artistRepo.save(new Artist("Nirvana", "https://upload.wikimedia.org/wikipedia/en/3/36/With_the_lights_out_nirvana.jpg"));
		Album album1 = albumRepo.save(new Album("Nevermind", "https://img.discogs.com/hzodGGZSp9P67i0X4uN_oGXwXXk=/fit-in/300x300/filters:strip_icc():format(jpeg):mode_rgb():quality(40)/discogs-images/R-3756184-1343119519-1245.jpeg.jpg", "DGC"));
		Song song1 = songRepo.save(new Song("Lithium", "https://www.youtube.com/embed/Tvc4JmWI4Ko", "4:16"));
		Song song2 = songRepo.save(new Song("Heart Shaped Box", "https://www.youtube.com/embed/n6P0SitRwy8", "4:45"));
		
		Album album11 = albumRepo.save(new Album("In Utero", "https://upload.wikimedia.org/wikipedia/en/e/e5/In_Utero_%28Nirvana%29_album_cover.jpg", "DGC"));
		Song song11 = songRepo.save(new Song("All Apologies", "https://www.youtube.com/embed/n6P0SitRwy8", "4:45"));
		Artist artist2 = artistRepo.save(new Artist("Nine Inch Nails", "http://media.cleveland.com/pdextra/photo/9482895-large.jpg"));
		Album album2 = albumRepo.save(new Album("Pretty Hate Machine", "https://upload.wikimedia.org/wikipedia/en/f/f1/Nine_Inch_Nails_-_Pretty_Hate_Machine.png", "TVT"));
		Song song3 = songRepo.save(new Song("Down In It", "https://www.youtube.com/embed/NkphW38WyYo", "4:37"));
		Song song4 = songRepo.save(new Song("Head Like A Hole", "https://www.youtube.com/embed/nOVW938sr0k", "5:00"));

		Artist artist3 = artistRepo.save(new Artist("Sublime", "https://upload.wikimedia.org/wikipedia/en/a/a0/Bud_Gaugh%2C_Eric_Wilson%2C_and_Brad_Nowell_of_Sublime_%281996%29.jpg"));
		Album album3 = albumRepo.save(new Album("Sublime", "https://upload.wikimedia.org/wikipedia/en/9/94/Sublime_Self-Titled.jpg", "MCA"));
		Song song5 = songRepo.save(new Song("Santeria", "https://www.youtube.com/embed/k3ZeUL4fRyk", "3:04"));
		Song song6 = songRepo.save(new Song("What I got", "https://www.youtube.com/embed/0Uc3ZrmhDN4", "2:53"));

		album1.addArtistToAlbum(artist1);
		album1.addRatingToAlbum(rating1);
		album1.addCommentToAlbum(comment1);
		album1.addTagToAlbum(tag1);
		
		album11.addArtistToAlbum(artist1);
		album11.addRatingToAlbum(rating1);
		album11.addCommentToAlbum(comment1);
		album11.addTagToAlbum(tag1);

		album2.addArtistToAlbum(artist2);
		album2.addRatingToAlbum(rating1);
		album2.addCommentToAlbum(comment1);
		album2.addTagToAlbum(tag1);

		album3.addArtistToAlbum(artist3);
		album3.addRatingToAlbum(rating1);
		album3.addCommentToAlbum(comment1);
		album3.addTagToAlbum(tag1);

		albumRepo.save(album1);
		albumRepo.save(album11);
		albumRepo.save(album2);
		albumRepo.save(album3);
		
		song1.addArtistToSong(artist1);
		song1.addAlbumToSong(album1);
		song1.addRatingToSong(rating1);
		song1.addCommentToSong(comment1);
		
		song11.addArtistToSong(artist1);
		song11.addAlbumToSong(album11);
		song11.addRatingToSong(rating1);
		song11.addCommentToSong(comment1);

		song2.addArtistToSong(artist1);
		song2.addAlbumToSong(album1);
		song2.addRatingToSong(rating1);
		song2.addCommentToSong(comment1);

		song3.addArtistToSong(artist2);
		song3.addAlbumToSong(album2);
		song3.addRatingToSong(rating1);
		song3.addCommentToSong(comment1);

		song4.addArtistToSong(artist2);
		song4.addAlbumToSong(album2);
		song4.addRatingToSong(rating1);
		song4.addCommentToSong(comment1);

		song5.addArtistToSong(artist3);
		song5.addAlbumToSong(album3);
		song5.addRatingToSong(rating1);
		song5.addCommentToSong(comment1);

		song6.addArtistToSong(artist3);
		song6.addAlbumToSong(album3);
		song6.addRatingToSong(rating1);
		song6.addCommentToSong(comment1);

		songRepo.save(song1);
		songRepo.save(song2);
		songRepo.save(song3);
		songRepo.save(song4);
		songRepo.save(song5);
		songRepo.save(song6);
		songRepo.save(song11);
	}
}
